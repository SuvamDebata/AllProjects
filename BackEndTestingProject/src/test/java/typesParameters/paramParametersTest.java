package typesParameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class paramParametersTest {
	
	@Test
	public void sampleTest() {
		given()
		 .param("teamSize", 10)
		  .log().all()
		  .when()
		/*  //Use Post method act as FormParam
		   .post("http://49.249.28.218:8091/project") */
		  //Use get method work as QueryParam
		   .get("http://49.249.28.218:8091/project")
		 .then()
		   .log().all();
		
	}

}