package moc;

import org.apache.commons.lang3.StringUtils;

import com.jayway.jsonpath.JsonPath;

import spark.Spark;

public class CreditCardMock {

	public static void main(String[] args) {

		Spark.port(8889);
		Spark.post("/credit-card",(req,res)->{
			String response="";
			String card=JsonPath.read(req.body().toString(), "$.creditcard");
			/*if(card.equals("123456789123"))*/ //works only for this specific cc, for multiple we can use
			if(StringUtils.equalsAny(card, "123456789123","123456789456","123456789789"))//org.apache.commons.lang3.StringUtils
			{
				response="{\"status\":\"Payment success\"}";
				res.status(200);
			}
			else {
				response="{\"status\":\"Payment failed\"}";
				res.status(404);

			}
			res.type("application/json");
			return response;
		});
		System.out.println("===========Running===========");
	}

}
