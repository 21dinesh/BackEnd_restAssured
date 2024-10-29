package encryptionAndDecryption;

import java.util.Base64;

import org.testng.annotations.Test;

public class besic_base64Encryption {
	@Test
	public void sempleTest() {
		String enred= new String(Base64.getEncoder()
				.encode("ABC".getBytes()));
		System.out.println("DecryptedData:==>"+enred);
	}

}
