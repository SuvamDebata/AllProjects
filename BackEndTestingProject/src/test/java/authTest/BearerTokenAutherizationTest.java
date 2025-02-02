package authTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerTokenAutherizationTest {
	
	@Test
	
	public void sampleTest(){
		given()
		//HrmNinja Application uses go to setting and generate BearerToken
		  .auth().oauth2("eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJsZUN3YUNPai00RXVlbzJkTFFrTmZuLXh2M0F3Nm5ZdWZtS0pINXBFWkNNIn0.eyJleHAiOjE3MjQyMzU2MjQsImlhdCI6MTcyNDIzMzg3MSwianRpIjoiNWQ0MGVlNTAtMzRkZS00MDk2LWEyNTUtMjcxZjhjMWU1NTkzIiwiaXNzIjoiaHR0cDovLzQ5LjI0OS4yOC4yMTg6ODE4MC9hdXRoL3JlYWxtcy9uaW56YSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI0ODVlYTJhYi1kY2MzLTQwOGItOTUxZi04NGMwM2JmZDAwMmYiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJuaW56YS1jbGllbnQiLCJzZXNzaW9uX3N0YXRlIjoiZDk1ZjA3M2EtOWU2ZS00MDllLWI2YjQtNjQ3YWUzYmI1NDNlIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwOi8vNDkuMjQ5LjI4LjIxODo4MDkxIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJkZWZhdWx0LXJvbGVzLW5pbnphIiwib2ZmbGluZV9hY2Nlc3MiLCJhZG1pbiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwic2lkIjoiZDk1ZjA3M2EtOWU2ZS00MDllLWI2YjQtNjQ3YWUzYmI1NDNlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJybWd5YW50cmEifQ.ZunvjPhSBgz9tyyRGdyBfP0c36xUotb1_9WJQCPCKhxre1zo3NvQylB6NCF2Wc6nbgGxxLdFnkG3CnYYDKhz9wamUFVQGVZ-_DacHV0XfNu0x4P0sdYrrLWG7VQLZy9rByeL1g0yj8MWZuofI348SVJ-5kDXkcha3LYhBfPRu12ZSsnOzVxPql8V5nnsdQQsuDvsFJ87K90ITvj8Xvd1e6WTX2UH8cwhu62Vz3Exz1eBpQiT29wkSBMwiwKFBOOoQ-RW2AugEPpBcaowP_EHsm5nlozI_fIIN7ULwIWcsQNsM8xYrCnLYRoF34wcXjx_s1oCklrLGuIuK2VWHThMcg")
		  .log().all()
		 .when()
		   .get("http://49.249.28.218:8091/projects")
		   .then()
		    .log().all();
	}

}
