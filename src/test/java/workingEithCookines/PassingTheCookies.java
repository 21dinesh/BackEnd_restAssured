package workingEithCookines;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PassingTheCookies {
	@Test
	public void sample() {
		JSONObject jsonObj = new JSONObject();
	 given().cookies("username", "dk").log().all()
	.when()
	.put("http://49.249.28.218:8091/project/NH_PROJ_686")
	.then().log().all();
}}


