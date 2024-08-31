package encryption;

import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/*
 * private key : AcO3tEam@j!tu_#1
 */

public class EncrypAndDecryptUtility {
	public String encrypt(String input,String secretkey) throws Exception {
		SecretKeySpec secretKeySpec = new SecretKeySpec(secretkey.getBytes(), "AES"); 
		IvParameterSpec ivParameterSpec = new IvParameterSpec("4234567890123456".getBytes());
		Cipher cipher=Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
		byte[] encrypted = cipher.doFinal(input.getBytes());
		return Base64.getEncoder().encodeToString(encrypted);
	}
	
	public String decrypt (String input, String secretkey) throws Exception, BadPaddingException {
		SecretKeySpec SecretKeySpec = new SecretKeySpec(secretkey.getBytes(),"AES");
		IvParameterSpec ivParameterSpec = new IvParameterSpec("4234567890123456".getBytes());
		Cipher cipher=Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, SecretKeySpec, ivParameterSpec);
		byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(input));
		return new String(decrypted);
	}

}
