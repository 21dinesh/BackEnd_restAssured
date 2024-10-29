package workingEithCookines;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PassingMultiCookies {
	@Test
	public void sample() {
	JSONObject jsonObj = new JSONObject();
	//pasing mautipal value of a key
    given().cookies("username", "dk","k2","v2"+"v3").log().all()
    .when()
    .put("http://49.249.28.218:8091/project/NH_PROJ_686")
    .then().log().all();
  }

}
