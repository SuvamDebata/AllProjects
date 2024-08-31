package com.sample.crud.withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForREADTest {
		@Test
		public void getDataFromServer()
		{
			Response resp= get("http://49.249.28.218:8091/projects");
			resp.then().assertThat().statusCode(200);
			resp.then().log().all();

		}
		@Test
		public void postDataToServer()
		{
			JSONObject jsonObj=new JSONObject();
			jsonObj.put("createdBy", "SUVAM");
			jsonObj.put("status", "Created");
			jsonObj.put("teamSize", 0);
			jsonObj.put("projectName", "RakshaKaro3");
			
			RequestSpecification req=given();
			req.contentType(ContentType.JSON);
			req.body(jsonObj.toJSONString());
			
			Response resp= req.post("http://49.249.28.218:8091/addProject");
			resp.then().assertThat().statusCode(201);
			resp.then().log().all();

		}
		@Test
		public void putDataToServer()
		{
			JSONObject jsonObj=new JSONObject();
			jsonObj.put("createdBy", "SUVAM");
			jsonObj.put("status", "Created");
			jsonObj.put("teamSize", 0);
			jsonObj.put("projectName", "RakshaKaro6");
			
			RequestSpecification req=given();
			req.contentType(ContentType.JSON);
			req.body(jsonObj.toJSONString());
			
			Response resp= req.put("http://49.249.28.218:8091/project/NH_PROJ_8710");
			resp.then().assertThat().statusCode(200);
			resp.then().log().all();

		}
		@Test
		public void patchDataToServer()
		{
			JSONObject jsonObj=new JSONObject();
			jsonObj.put("projectName", "RakshaKaro5");
			
			RequestSpecification req=given();
			req.contentType(ContentType.JSON);
			req.body(jsonObj.toJSONString());
			
			Response resp= req.patch("http://49.249.28.218:8091/project/NH_PROJ_8710");
			resp.then().assertThat().statusCode(200);
			resp.then().log().all();

		}
		@Test
		public void deleteDataFromServer()
		{
			
			Response resp= delete("http://49.249.28.218:8091/project/NH_PROJ_8710");
			resp.then().assertThat().statusCode(204);
			resp.then().log().all();

		}

}
