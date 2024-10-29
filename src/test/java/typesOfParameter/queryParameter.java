package typesOfParameter;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class queryParameter {
	
	@Test
	public void sampleTest() {
		given()
		  .queryParam("teamSize", 10)
		.when()
		   .get("http://49.249.28.218:8091/project")
		.then()
		.log().all();
	}
}