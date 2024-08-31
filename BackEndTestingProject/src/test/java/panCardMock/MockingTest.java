package panCardMock;

import org.mockito.Mockito;

class PANcard{
	
	public String isValid(String panCard) { 
		if(panCard.matches("[A-Z]{5}[0-9]{4}[A-Z]")==true)
			return "Valid PanCard";
		else
			return "InValid PanCard";
		
	}
	public static PANcard getMockObject() {
		PANcard mocObj=Mockito.mock(PANcard.class);
		Mockito.when(mocObj.isValid("ABCDE1234AA")).thenReturn("valid PAN CARD");
		Mockito.when(mocObj.isValid("ABCDE1234B")).thenReturn("valid PAN CARD");
		Mockito.when(mocObj.isValid("ABCDE1234C")).thenReturn("invalid PAN CARD");
		return mocObj;
		
	}
	
}

public class MockingTest {

	public static void main(String[] args) {
		
		PANcard obj=PANcard.getMockObject();
		System.out.println(obj.isValid("ABCDE1234AA"));

	}

}
