package samplePackage;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class MethodChaningAndStaticImport {
	@Test
	public void sampleGetReqTest()
	{
		get("https://reqres.in/api/users?page=2").prettyPrint();
		
	}
	
}


