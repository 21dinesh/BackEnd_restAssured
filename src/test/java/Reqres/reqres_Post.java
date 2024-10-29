package Reqres;

import org.json.simple.JSONObject;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class reqres_Post {
	public static void main(String[] args) {
	
	
	JSONObject jObj  = new JSONObject();
	jObj.put("name", "morpheus");
	jObj.put("job","leader");
	
	given().contentType(ContentType.JSON)
	.body(jObj.toJSONString()).
	when().post("https://reqres.in/api/users").then().assertThat().statusCode(201).log().all();
	}
	}
