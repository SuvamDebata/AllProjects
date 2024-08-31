package requestChaining;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Scenario_4_CreateOrderWithPaymentNimbbl {
	public static void main(String[] args) {
		//http://nimbbl.biz/docs/api-reference/introduction/
		
		//Set base URL
		String baseURL="http://api.nimbbl.tech/";
		String authEndPoint = "api/v3/generate-token";
		
		System.out.println("***************Authorization POST Request***************");
		//Authorization POST Request to generate token

		
		File fileObj=new File("./nimbblAuth.json");
		Response AuthorizationResponseBody=given().log().all()
			.contentType(ContentType.JSON)
			.body(fileObj)
		.when()
			.post(baseURL+authEndPoint);
			AuthorizationResponseBody.then().log().all();
			
			String token=AuthorizationResponseBody.jsonPath().get("token");
			System.out.println(token);
		
		
		
		
		
		
		
	}

}
