package typesOfParameter;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class queryParameterTest2 {
	
	@Test
	public void sampleTest() {
		given()
		  //.pathParam("projectId", "NH_PROJ_965")
		.when()
		   .get("http://49.249.28.218:8091/project?projectId=NH_PROJ_965")
		.then()
		.log().all();
	}
}