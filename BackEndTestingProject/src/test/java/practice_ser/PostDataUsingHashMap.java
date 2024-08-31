package practice_ser;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostDataUsingHashMap {
	@Test
	public void postDataToServer()
	{
		HashMap<String,Object> map=new HashMap();
		map.put("createdBy", "SUVAM");
		map.put("status", "Created");
		map.put("teamSize", 0);
		map.put("projectName", "asus02");
		
		given()
			.contentType(ContentType.JSON)
			.body(map)
		.when()
			.post("http://49.249.28.218:8091/addProject")
		.then()
			.assertThat().statusCode(201)
			.log().all();

	}

}
