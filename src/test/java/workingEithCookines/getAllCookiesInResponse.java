package workingEithCookines;

import static io.restassured.RestAssured.*;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class getAllCookiesInResponse {
	@Test
	public void getAllcookies() {
		
		Response resp = given().when().get("https://www.google.com");
				Map<String, String> allcookies = resp.getCookies();
	         System.out.println( allcookies.keySet());
	         
	         for (String key: allcookies.keySet()) {
	        	 String value = resp.getCookie(key);
	        	 System.out.println(key+" "+value);
	         }
	
	
	}

}
