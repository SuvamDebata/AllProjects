package authTest;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth2_0_Test {
	
	@Test
	
	public void sampleTest(){
	Response resp =	given()
		//Every time run then generate new token so this reason it is very very secure
		//keycloak application uses for first time generate token
		//i want to capture token id so use response, so i used formparam()
		  .formParam("client_id", "ninza-client")
		  .formParam("client_secret", "gPQBf1Yxew5OMccMhzos1GefIyiSnXzM")
		  .formParam("grant_type", "client_credentials")
		 .when()
		   .post("http://49.249.28.218:8180/auth/realms/ninza/protocol/openid-connect/token");
		   resp.then()
		    .log().all();
		   
		   //Above line codes run the you find access_token
		   //Capture token from the response [keyClock Outh2.0]
		   String token = resp.jsonPath().get("access_token");
		   
		   given()
		     .auth().oauth2(token)
		     .log().all()
		   .when()
		     .get("http://49.249.28.218:8091/projects")
		    .then()
		     .log().all();
	}

}
