package working_With_dataMasking;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class testdatamasking {
	@Test
	public void test() {
JSONObject jsonObj= new JSONObject();

jsonObj.put("createdBy", "Dinesh");
jsonObj.put("status", "Created");
jsonObj.put("teamSize", 0);
jsonObj.put("projectName", "HeadrRes0");


		given().contentType(ContentType.JSON)
		.config(RestAssured.config.logConfig(LogConfig.logConfig()
				.blacklistHeader("Content-Type")))
		.body(jsonObj)
		.post("http://49.249.28.218:8091/addProject")
		.then().log().all();	
		
	}

}
