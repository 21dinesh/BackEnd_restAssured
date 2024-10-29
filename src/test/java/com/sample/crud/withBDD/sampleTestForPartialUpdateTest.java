package com.sample.crud.withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class sampleTestForPartialUpdateTest {
	@Test
	public void putDataToServer() {		
		JSONObject jsonObj= new JSONObject();

		jsonObj.put("createdBy", "dk");
		jsonObj.put("status", "Created");
		jsonObj.put("teamSize", 10);
		jsonObj.put("projectName", "learnRestAssured_333");
		
		given().contentType(ContentType.JSON).body(jsonObj.toJSONString())
		.when().patch("http://49.249.28.218:8091/project/NH_PROJ_689")
	.then().log().all();
		
	} 
	

}
