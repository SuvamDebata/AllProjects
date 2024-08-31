package dataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddMultipleProjectTest {
	
	@Test(dataProvider = "getData")
	public void sampleTest(String pName, String status ) {
//		String pName = "Google";
//		String status = "Created";
		String reqBody = "{\r\n"
				+ "  \"createdBy\": \"Suvam\",\r\n"
				+ "  \"projectName\": \""+pName+"\",\r\n"
				+ "  \"status\": \""+status+"\",\r\n"
				+ "  \"teamSize\": 0\r\n"
				+ "}";
		
		given()
		 .contentType(ContentType.JSON)
		 .body(reqBody)
		.when()
		 .post("http://49.249.28.218:8091/addProject")
		.then()
		 .log().all();
	}
	
/*	@DataProvider
	public Object[][] getData() {
		//Data provider first Row and Second Column column-2(only for pName and status)
		//Data write HardCoded
		Object [][] objarr = new Object[3][2];
		objarr[0][0] = "AirIndia_1";
		objarr[0][1] = "Created";
		
		objarr[1][0] = "AirIndia_2";
		objarr[1][1] = "Created";
		
		objarr[2][0] = "AirIndia_3";
		objarr[2][1] = "Created";
		return objarr;    */
	
	
	@DataProvider
	public Object[][] getData() throws Throwable{
		ExcelUtility eLib = new ExcelUtility();
		int count = eLib.getRowcount("Sheet1");
		Object[][] objarr = new Object[count][2]; 
		
		for(int i=0; i<count ;i++) {
			//i+1-->i want to start data row 1 not start in row 0
			objarr[i][0] = eLib.getDataFromExcel("Sheet1", i+1, 0);
			objarr[i][1] = eLib.getDataFromExcel("Sheet1", i+1, 1);
		}
		return objarr;
	}

}
