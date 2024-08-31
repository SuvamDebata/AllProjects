package practice.response.validation;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

public class ResponseDisplayAllProjects {
	@Test
	public void verifyHeader() {
		/*
		 * Random random=new Random(); int ranNum=random.nextInt(5000); ProjectPojo
		 * pobj= new ProjectPojo("Asus"+ranNum, "Created", "Suvam",0);
		 * 
		 * given() .contentType(ContentType.JSON) .body(pobj) .when()
		 * .post("http://49.249.28.218:8091/addProject");
		 */
		Response resp=given()
			.when().get("http://49.249.28.218:8091/projects-paginated");
		resp.then().log().all();
		
		//Display All Project ID with * is not allowed
		//resp.jsonPath().get("content[*].projectId");
		
		//therefore we have to pass it without * and store it in a list
		ArrayList<String> lst =resp.jsonPath().get("content.projectId");
		System.out.println(lst);
		
		// But we cannot put any conditions to get the specific lists
		//we will use the JSON dependency
		ArrayList<String> lst2 =JsonPath.read(resp.asString(),"content[*].projectName");
		for(String data:lst2)
			System.out.println(data);
		ArrayList<String> lst3 =JsonPath.read(resp.asString(),"content[*].[?(@.projectName=='Asus1371')].projectId");
		System.out.println(lst3.get(0));
		
		//as we have extracted the data we cannot use the rest assured assertion so we will go for testNG assertion
		Assert.assertEquals(lst3.get(0), "NH_PROJ_004");
	}
	

}
