package requestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclass.utility.ProjectPojo;

public class Scenario_1_Delete_Project {

	@Test
	public void postDataToServer() {
		Random random=new Random();
		int ranNum=random.nextInt(5000);
		ProjectPojo pobj= new ProjectPojo("JaiSriRam"+ranNum, "Created", "Hanuman",0);
		
	//API 1=>Add a Project Inside the Server
		Response resp=given()
			.contentType(ContentType.JSON)
			.body(pobj)
		.when()
			.post("http://49.249.28.218:8091/addProject");
		resp.then().log().all();
		resp.then().assertThat().statusCode(201);
		
		//Capture project name from the response
		String projectName=resp.jsonPath().getString("projectName");
		String projectId=resp.jsonPath().getString("projectId");
		System.out.println(projectName+"\n====================");
		
		given()
		.when()
			.get("http://49.249.28.218:8091/projects-paginated")
		.then()
			.log().all();
		
	//API 2=> DeleteProject	
		given()
		.when()
			.delete("http://49.249.28.218:8091/project/"+projectId)
		.then()
			.log().all()
			.assertThat().statusCode(204);
		
		given()
		.when()
			.get("http://49.249.28.218:8091/projects-paginated")
		.then()
			.log().all();
		

}
}
