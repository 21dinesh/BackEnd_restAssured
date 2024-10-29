package com.sample.crud.withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class sampleTestForCreateTest {
	@Test
	public void postDataToServer() {		
		JSONObject jsonObj= new JSONObject();
		
		jsonObj.put("createdBy", "dk");
		jsonObj.put("status", "Created");
		jsonObj.put("teamSize", 0);
		jsonObj.put("projectName", "TestPathParameter");
		
		given().contentType(ContentType.JSON)
		  .body(jsonObj.toJSONString())
		.when()
		  .post("http://49.249.28.218:8091/addProject")
		.then().assertThat().statusCode(201)
		  .log().all();
		


	}
	

}