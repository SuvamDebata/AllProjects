package com.sample.crud.withoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;


public class SampleTestForREADTest {
		@Test
		public void getDataFromServer()
		{
			given()
				.get("http://49.249.28.218:8091/projects")
			.then()
				.assertThat().statusCode(200)
				.log().all();

		}
		@Test
		public void postDataToServer()
		{
			JSONObject jsonObj=new JSONObject();
			jsonObj.put("createdBy", "SUVAM");
			jsonObj.put("status", "Created");
			jsonObj.put("teamSize", 0);
			jsonObj.put("projectName", "asus01");
			
			given()
				.contentType(ContentType.JSON)
				.body(jsonObj.toJSONString())
			.when()
				.post("http://49.249.28.218:8091/addProject")
			.then()
				.assertThat().statusCode(201)
				.log().all();

		}
		@Test
		public void putDataToServer()
		{
			JSONObject jsonObj=new JSONObject();
			jsonObj.put("createdBy", "SUVAM");
			jsonObj.put("status", "Created");
			jsonObj.put("teamSize", 0);
			jsonObj.put("projectName", "RakshaKaro6");
			
			given()
				.contentType(ContentType.JSON)
				.body(jsonObj.toJSONString())
			.when()
				.put("http://49.249.28.218:8091/project/NH_PROJ_8770")
			.then()
				.assertThat().statusCode(200)
				.log().all();

		}
		@Test
		public void patchDataToServer()
		{
			JSONObject jsonObj=new JSONObject();
			jsonObj.put("projectName", "RakshaKaro5");
			
			given()
				.contentType(ContentType.JSON)
				.body(jsonObj.toJSONString())
			.when()
				.patch("http://49.249.28.218:8091/project/NH_PROJ_8770")
			.then()
				.assertThat().statusCode(200)
				.log().all();

		}
		@Test
		public void deleteDataFromServer()
		{
			given()
				.delete("http://49.249.28.218:8091/project/NH_PROJ_8770")
			.then()
				.assertThat().statusCode(204)
				.log().all();

		}

}
