package encryption;

import org.testng.annotations.Test;

public class AESEncriptedTest {
	
	@Test
	public void sampleTest() throws Exception {
		String privateKey = "AcO3tEam@j!tu_#1";
		//First write notepad and copy and paste in programm--->{"name" : "Rajesh","id":"tp-1"}
		String data = "{\"name\" : \"Suvam\",\"id\":\"tp-04\"}";
		
		EncrypAndDecryptUtility ed = new EncrypAndDecryptUtility();
		//System.out.println(ed.encrypt(data, privateKey));
		
	   System.out.println(ed.decrypt("QX0T2SoZklUOlGmD8ghCcv8oOi0doIULuSLO5oj+KM4=", privateKey));
		
	}

}
