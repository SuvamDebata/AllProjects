package practice_ser;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoclass.utility.ProjectPojo;

public class PostDataUsingPojoClass {
	@Test
	public void postDataToServer()
	{
		Random random=new Random();
		int ranNum=random.nextInt(5000);
		ProjectPojo pobj= new ProjectPojo("Asus"+ranNum, "Created", "Suvam",0);
		
		given()
			.contentType(ContentType.JSON)
			.body(pobj)
		.when()
			.post("http://49.249.28.218:8091/addProject")
		.then()
			.assertThat().statusCode(201)
			.log().all();

	}

}
