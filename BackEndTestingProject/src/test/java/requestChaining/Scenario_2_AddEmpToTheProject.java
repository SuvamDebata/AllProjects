package requestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclass.utility.AddEmployeePOJO;
import pojoclass.utility.ProjectPojo;

public class Scenario_2_AddEmpToTheProject {

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
		//String projectId=resp.jsonPath().getString("projectId");
		System.out.println(projectName+"\n====================");
		
	//API 2=> AddEmployeeToProject
		AddEmployeePOJO empObj=new AddEmployeePOJO("Hero","14/12/1996","hero@gmail.com",
				"Hanu_"+ranNum ,4.5,"9040127075",projectName, "Bhakt","Hanu_"+ranNum);
		given()
			.contentType(ContentType.JSON)
			.body(empObj)
		.when()
			.post("http://49.249.28.218:8091/employees")
		.then()
			.assertThat().statusCode(201)
			.log().all();
}
}
