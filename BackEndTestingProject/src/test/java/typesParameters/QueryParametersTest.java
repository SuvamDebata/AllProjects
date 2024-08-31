package typesParameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParametersTest {
	
	@Test
	public void sampleTest() {
		given()
		 .queryParam("teamSize", 10)
		  .when()
		   .get("http://49.249.28.218:8091/project")
		 //Hard coded in below side
/*	//	 .pathParam("projectId", "NH_PROJ_8746")
		 .when()
//		    .get("http://49.249.28.218:8091/project?projectId=NH_PROJ_8746")
		    //Query parameters is also use flitering Data(i want to filter the data their Team size=10)
		    .get("http://49.249.28.218:8091/project?teamSize=10") */
		 .then()
		   .log().all();
		
	}

}
