package practice_ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import io.restassured.response.Response;


public class verifyResponseTimeTest {
	@Test
	public void verifyHeader() {
		Response resp = given().get("http://49.249.28.218:8091/projects");
		 resp.then().log().all();
		 
		long timeTaken =resp.time();		
		long timeTakenSec = resp.getTimeIn(TimeUnit.SECONDS) ;
		
		System.out.println(timeTaken);
		System.out.println(timeTakenSec);
		
		resp.then().assertThat().time(Matchers.lessThan(900L));
		
		resp.then().assertThat().time(Matchers.greaterThan(500L));
		
		resp.then().assertThat().time(Matchers.both(Matchers.lessThan(900L)).and(Matchers.greaterThan(300L)));
		
	}

}
