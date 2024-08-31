package practice.response.validation;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclass.utility.ProjectPojo;

public class VerifyResponseHeaderTest {
	@Test
	public void verifyHeader() {
		Random random=new Random();
		int ranNum=random.nextInt(5000);
		ProjectPojo pobj= new ProjectPojo("Asus"+ranNum, "Created", "Suvam",0);
		
		Response resp=given()
			.contentType(ContentType.JSON)
			.body(pobj)
		.when()
			.post("http://49.249.28.218:8091/addProject");
		resp.then().assertThat().statusCode(201);
		resp.then().log().all();
		resp.then().assertThat().header("Transfer-Encoding", "chunked");// for verifying any Response header
		
		//ResponseTime
		resp.then().assertThat().time(Matchers.lessThan(900L));
		resp.then().assertThat().time(Matchers.greaterThan(300L));
		resp.then().assertThat().time(Matchers.both(Matchers.lessThan(900L)).and(Matchers.greaterThan(300L)));
		
		//Response Body Validation
		resp.then().assertThat().body("numberOfElements", Matchers.greaterThanOrEqualTo(20));
		resp.then().assertThat().body("pageable.sort.unsorted", Matchers.equalTo(true));
		resp.then().assertThat().body("content[0].projectId", Matchers.equalTo("NH_PROJ_024"));
		
		
	
	}
	

}
