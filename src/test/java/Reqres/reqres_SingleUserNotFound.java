package Reqres;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class reqres_SingleUserNotFound {

	public static void main(String[] args) {
		JSONObject jObj = new JSONObject();
		
		 given().contentType(ContentType.JSON)
		 .when().get("https://reqres.in/api/users/23")
		 .then().log().all();
		 
//         .body(jObj.toJSONString()).when()
//         .get("https://reqres.in/api/users/23")
//          .then().assertThat().statusCode(404)
//          .log().all();
	}

}
