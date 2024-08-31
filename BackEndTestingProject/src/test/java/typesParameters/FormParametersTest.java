package typesParameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class FormParametersTest {
	
	@Test
	public void sampleTest() {
		given()
		 .formParam("teamSize", 10)
		  .log().all()
		  .when()
		   .post("http://49.249.28.218:8091/project")
		 .then()
		   .log().all();
		
	}

}
