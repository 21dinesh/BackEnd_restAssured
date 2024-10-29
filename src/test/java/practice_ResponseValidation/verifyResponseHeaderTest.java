package practice_ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class verifyResponseHeaderTest {
   @Test
   public void verifyheader() {
	 Response resp =  given()
	     .get("http://49.249.28.218:8091/Projects");
	 resp.then().log().all();
	 
	 resp.then().assertThat().contentType("text/html");
	 
	 resp.then().assertThat().statusLine("HTTP/1.1 200 ");
	   
	 resp.then().assertThat().statusCode(200);
	 
	 resp.then().assertThat().header("Pragma", "no-cache");
   }
}