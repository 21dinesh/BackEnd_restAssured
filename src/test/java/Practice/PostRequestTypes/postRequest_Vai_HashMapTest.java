package Practice.PostRequestTypes;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class postRequest_Vai_HashMapTest {
		@Test
		public void postDataToServer() {
		HashMap<String,Object> hashMapObj = new HashMap<>();
			
		
		hashMapObj.put("createdBy", "DK");
		hashMapObj.put("status", "Created");
		hashMapObj.put("teamSize", 10);
		hashMapObj.put("projectName", "Apple");
		
		given().contentType(ContentType.JSON)
		.body(hashMapObj)
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then().assertThat().statusCode(201)
		.log().all();
		
		}
	}

