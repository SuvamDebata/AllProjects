package simulation;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Driver {

	public static void main(String[] args) throws Throwable {
		String TRANSACTION_ID_VAR="";
		String TRANSACTION_DATE_VAR="";
		String TRANSACTION_AMOUNT_VAR="";
		String PAYER_PSP_VAR="";
		String PAYEE_PSP_VAR="";
		String path=args[0];
		ExcelUtility eLib = new ExcelUtility(path);
		int rowCount = eLib.getRowcount("trxn")+1;
		for (int k=1;k<rowCount;k++)
		{
			TRANSACTION_ID_VAR="RYAN"+eLib.getJavaUtil().getCurrentDate("yyyy-MM-dd'T'HH:mm:ssZ").replace("-", "").replace("T", "").replace(":", "").replace("+", "")+k;
			TRANSACTION_DATE_VAR=eLib.getJavaUtil().getCurrentDate("dd/MM/yyyy").replace("/", "-");
			TRANSACTION_AMOUNT_VAR=eLib.getDataFromExcel("trxn", k, 2);
			PAYER_PSP_VAR=eLib.getDataFromExcel("trxn", k, 3);
			PAYEE_PSP_VAR=eLib.getDataFromExcel("trxn", k, 4);
			
			eLib.setDataIntoExcel("trxn", k, 0, TRANSACTION_ID_VAR);
			eLib.setDataIntoExcel("trxn", k, 1, TRANSACTION_DATE_VAR);
			
			System.out.print(TRANSACTION_ID_VAR+" ");
			System.out.print(TRANSACTION_DATE_VAR+" ");
			System.out.print(TRANSACTION_AMOUNT_VAR+" ");
			System.out.print(PAYER_PSP_VAR+" ");
			System.out.println(PAYEE_PSP_VAR+" \n");
			System.out.println("===================================");
			
			String reqBody="{\"Transaction_ID\":\""+TRANSACTION_ID_VAR+"\",\"Transaction_Mode\":\"ONLINE\",\"Transaction_Date\":\""+TRANSACTION_DATE_VAR+
					"\",\"Transaction_Time\":\"11:01:28:930 \",\"Transaction_Amount\":\""+TRANSACTION_AMOUNT_VAR+"\",\"Transaction_Type\":\"Transfer\","
					+ "\"Description\":\"Payer to Payee transaction via online mode\",\"Currency\":\"INR\",\"Location\":\"Mumbai Maharastra\","
					+ "\"Authorization_Code\":\"C123\",\"Merchant_Information\":\"Merchant Dharavi Mumbai\",\"Batch_Number\":\"06545678\","
					+ "\"Recurring_Indicator\":\"yes\",\"Tax_Information\":\"GS34567S\",\"Risk_Assessment_Score\":\"199\",\"Promotion_Coupon_Code\":\"CH123\","
					+ "\"Exchange_Rate\":\"67\",\"Transaction_Code\":\"TR12\",\"Notes\":\"This is a merchant transaction.\",\"Reference_Number\":\"REF991\","
					+ "\"Device_Information\":\"xiomi Note11\",\"MCC\":\"M123\",\"CVM\":\"OTP\",\"Regulatory_Compliance_Information\":\"KYC\",\"Payer_Details\""
					+ ":{\"Payer_PSP\":\""+PAYER_PSP_VAR+"\",\"Payer_Name\":\"Payer\",\"Bank_Account\":\"HDFC\",\"Account_Type\":\"Savings\",\"IFSC\":\"HDF01\","
					+ "\"Mobile_Number\":\"9887776676\",\"Address\":\"payer_address@123\",\"Ip_Address\":\"1235@fghj\",\"Mail_Id\":\"mohoan@gmail.com\","
					+ "\"Balance\":\"690000.90\"},\"Payee_Details\":{\"Payee_PSP\":\""+PAYEE_PSP_VAR+"\",\"Payee_Name\":\"Payee\",\"Bank_Account\":\"ICICI\","
					+ "\"Account_Type\":\"Savings\",\"IFSC\":\"ICIC01\",\"Mobile_Number\":\"9886662222\",\"Address\":\"payee_address@123\",\"Mail_Id\":\"suvam007@gmail.com\"}"
					+ ",\"Transaction_Status\":\"Completed\",\"isUPITransaction\":true,\"Sender_Source\":\"Remitter\",\"Recipient_Destination\":\"Benificiary\"}";
			Response resp=given()
					.contentType(ContentType.JSON)
					.body(reqBody)
				.when()
					.post("http://49.249.29.5:8091/add-transaction");
				resp.then().log().all();
				resp.then().assertThat().statusCode(200);
		}
	}

}
