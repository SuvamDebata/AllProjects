package shopperStack;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoUtility.regisPojo;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class End2End {
	String email;
	regisPojo  rpobj=new regisPojo("Cuttack", "India", email , "Suvam", "MALE", "Debata", "Shop1234", 9040127075l, "Odisha", "ALPHA");;
	String userId;
	String jwtToken;
	String productId;
	String itemId;
	String addressId;
	String orderId;
	@Test
	public void register() throws StreamWriteException, DatabindException, IOException
	{	int ran=(int) (Math.random()*1000);
	String email="shopperStack"+ran+"@gmail.com";
		rpobj.setEmail(email);
		given()
			.contentType(ContentType.JSON)
			.body(rpobj)
		.when()
			.post("https://www.shoppersstack.com/shopping/shoppers")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		ObjectMapper objm = new ObjectMapper();
		objm.writeValue(new File ("./register.json"), rpobj);
	}

	@Test /* (dependsOnMethods = "register") */
	public void login() throws StreamReadException, DatabindException, IOException
	{	
		File fileObj=new File("./register.json");
		FileInputStream input= new FileInputStream(fileObj);
		ObjectMapper read = new ObjectMapper();
		regisPojo ref = read.readValue(input, regisPojo.class);
		
		
		String loginBody="{\r\n"
				+ "  \"email\":\""+ref.getEmail()+"\",\r\n"
				+ "  \"password\":\"Shop1234\",\r\n"
				+ "  \"role\":\"SHOPPER\"\r\n"
				+ "}";
		Response resp = given()
		.contentType(ContentType.JSON)
		.body(loginBody)
		.log().all()
	.when()
		.post("https://www.shoppersstack.com/shopping/users/login");
		resp.then().assertThat().statusCode(200).log().all();
		int uid = resp.jsonPath().get("data.userId");
		userId=""+uid;
		System.out.println(userId);
		jwtToken =resp.jsonPath().get("data.jwtToken");
		System.out.println(jwtToken);
	

}

@Test  (dependsOnMethods = "login") 
	public void getAllProducts() {
		Response resp = given()
				/* .log().all() */
			.when()
				.get("https://www.shoppersstack.com/shopping/products/alpha");
		resp.then().assertThat().statusCode(200)/* .log().all() */;
				productId =""+ resp.jsonPath().get("data[0].productId");
				System.out.println(productId);
		
	}
@Test (dependsOnMethods = "getAllProducts")
public void wishlist() {
String wishlistbody="{\r\n"
		+ "  \"productId\": \""+productId+"\",\r\n"
		+ "  \"quantity\": 0\r\n"
		+ "}";
Response resp = given()
					.auth().oauth2(jwtToken)
					.contentType(ContentType.JSON)
					.body(wishlistbody)
					.log().all()
				.when()
					.post("https://www.shoppersstack.com/shopping/shoppers/"+userId+"/wishlist");
		resp.then().assertThat().statusCode(201).log().all();	
}

@Test (dependsOnMethods = "getAllProducts")
public void cart() 
{
	String cartBody="{\r\n"
			+ "  \"productId\": \""+productId+"\",\r\n"
			+ "  \"quantity\": 1\r\n"
			+ "}";
	Response resp = given()
						.auth().oauth2(jwtToken)
						.contentType(ContentType.JSON)
						.body(cartBody)
						.log().all()
					.when()
						.post("https://www.shoppersstack.com/shopping/shoppers/"+userId+"/carts");
			resp.then().assertThat().statusCode(201).log().all();
			itemId=""+resp.jsonPath().get("data.itemId");
			System.out.println(itemId);
}


@Test (dependsOnMethods = "getAllProducts")
public void address() 
{
	String addressBody="{\r\n"
			+ "	  \"buildingInfo\": \"SLV Residency\",\r\n"
			+ "	  \"city\": \"Bengaluru\",\r\n"
			+ "	  \"country\": \"India\",\r\n"
			+ "	  \"landmark\": \"mapleBear\",\r\n"
			+ "	  \"name\": \"Suvam Debata\",\r\n"
			+ "	  \"phone\": \"9040127075\",\r\n"
			+ "	  \"pincode\": \"560010\",\r\n"
			+ "	  \"state\": \"Karnataka\",\r\n"
			+ "	  \"streetInfo\": \"Vinayak Nagar\",\r\n"
			+ "	  \"type\": \"Home\"\r\n"
			+ "	}";
	Response resp = given()
						.auth().oauth2(jwtToken)
						.contentType(ContentType.JSON)
						.body(addressBody)
						.log().all()
					.when()
						.post("https://www.shoppersstack.com/shopping/shoppers/"+userId+"/address");
			resp.then().assertThat().statusCode(201).log().all();
			addressId=""+resp.jsonPath().get("data.addressId");
			System.out.println(addressId);
}
@Test (dependsOnMethods = "address")
public void placeOrder() 
{
	String cartBody="{\r\n"
			+ "  \"address\": {\r\n"
			+ "    \"addressId\":"+addressId+"\r\n"
			+ "  },\r\n"
			+ "  \"paymentMode\": \"COD\"\r\n"
			+ "}";
	Response resp = given()
						.auth().oauth2(jwtToken)
						.contentType(ContentType.JSON)
						.body(cartBody)
						.log().all()
					.when()
						.post("https://www.shoppersstack.com/shopping/shoppers/"+userId+"/orders");
			resp.then().assertThat().statusCode(201).log().all();
			orderId=""+resp.jsonPath().get("data.orderId");
			System.out.println(orderId);

}
@Test (dependsOnMethods = "placeOrder")
public void getOrder() 
{
					given()
						.auth().oauth2(jwtToken)
						.log().all()
					.when()
						.get("https://www.shoppersstack.com/shopping/shoppers/"+userId+"/orders")
					.then().assertThat().statusCode(200).log().all();
}
@Test (dependsOnMethods = "getOrder")
public void updateOrder() 
{
					given()
						.auth().oauth2(jwtToken)
						.log().all()
					.when()
						.patch("https://www.shoppersstack.com/shopping/shoppers/"+userId+"/orders/"+orderId+"?status=DELIVERED")
					.then().assertThat().statusCode(200).log().all();
}

@Test (dependsOnMethods = "updateOrder")
public void invoiceOrder() 
{
					given()
						.auth().oauth2(jwtToken)
						.log().all()
					.when()
						.get("https://www.shoppersstack.com/shopping/shoppers/"+userId+"/orders/"+orderId+"/invoice")
					.then().assertThat().statusCode(200).log().all();
}
}
