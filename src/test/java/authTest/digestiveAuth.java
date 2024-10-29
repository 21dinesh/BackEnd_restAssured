package authTest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class digestiveAuth {
	@Test
	public void sampleTest() {
		given()
		
		.auth().preemptive().basic("rmgyantra", "rmgy@8888")  
		.log().all()
		
		.when()
		  .post("http://49.249.29.5:8091/login")
		.then()
		.log().all();
	}
}
