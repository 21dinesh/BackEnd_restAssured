package practice_ResponseValidation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class VerifyResponseBody_Vai_JsonPath {
	@Test
	public void sampleTest() {
		given().get("http://49.249.28.218:8091/Projects-paginated")
		 .then().log().all();
	}

}
