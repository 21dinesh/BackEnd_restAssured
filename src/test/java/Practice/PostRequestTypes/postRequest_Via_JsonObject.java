package Practice.PostRequestTypes;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class postRequest_Via_JsonObject {

	public class PostReq_vai_JSONObjet{
		@Test
		public void postDataToServer() {
		
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "DK");
		jObj.put("status", "Created");
		jObj.put("teamSize", 10);
		jObj.put("projectName", "Orange99");
		
		given().contentType(ContentType.JSON)
		.body(jObj.toJSONString())
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then().assertThat().statusCode(201)
		.log().all();
		
		}
	}
}
