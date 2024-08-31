package panCardMock;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PaymentTest {
	@Test
	public void paymentAPItest() {
		JSONObject obj=new JSONObject();
		obj.put("credit-card", "123456789456");
		obj.put("cvv", 123);
		obj.put("cardName", "ABC");
	Response resp = given()
		.contentType(ContentType.JSON)
		.body(obj)
		.log().all()
	.when()
		.post("http://localhost:8887/creditCard");
	resp.then().log().all();
//		.assertThat().statusCode(200).contentType(ContentType.JSON);
//	resp.then().log().all();
	}

}
