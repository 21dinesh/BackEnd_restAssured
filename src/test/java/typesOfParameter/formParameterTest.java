package typesOfParameter;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class formParameterTest {
	
	@Test
	public void sampleTest() {
		given()
		  .param("teamSize", 10)
		.when()
		   .post("http://49.249.28.218:8091/project")
		.then()
		.log().all();
	}
}