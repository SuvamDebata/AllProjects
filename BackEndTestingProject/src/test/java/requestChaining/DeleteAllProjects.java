package requestChaining;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

public class DeleteAllProjects {

	@Test(invocationCount = 15)
	public void deleteAllProjectFromServer() {
		Response resp=given()
				.when().get("http://49.249.28.218:8091/projects-paginated");
			resp.then().log().all();
		ArrayList<String> lst3 =JsonPath.read(resp.asString(),"content[*].projectId");
		for(String data:lst3)
		given()
		.when()
			.delete("http://49.249.28.218:8091/project/"+data);
		
}
}