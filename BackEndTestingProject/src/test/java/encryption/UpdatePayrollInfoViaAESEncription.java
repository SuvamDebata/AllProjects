package encryption;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class UpdatePayrollInfoViaAESEncription {

	@Test
	public void sampleTest() throws Exception {

		EncrypAndDecryptUtility ed = new EncrypAndDecryptUtility();
		
// privateKey = "Ac03tEam@j!tu_#1"
		String privateKey = "Ac03tEam@j!tu_#1";
		String jBody = "{ \"employee\": { \"empId\":\"NH_00011\", \"dob\": null, \"email\": \"JaiShriRam@gmail.com\", \"empName\": \"Hanu\", \"mobileNo\": \"9875641230\" }, \"hra\": 5000, \"insurance\": 5000, \"lta\": 5000, \"lwf\": 5000, \"netPay\": 5000, \"payroll_id\": 1, \"pf\": 0, \"pt\": 0, \"stat_bonus\": 0}";

		String jReqBody = ed.encrypt(jBody, privateKey);
		System.out.println(jReqBody);
		Response resp =    given()
				.body(jReqBody)
			  .when()
				.put("http://49.249.28.218:8091/payroll");
		        resp.then().log().all();

			 String respBody=ed.decrypt(resp.getBody().asString(), "Ac03tEam@j!tu_#1");
		     System.out.println(respBody);

	}

}
