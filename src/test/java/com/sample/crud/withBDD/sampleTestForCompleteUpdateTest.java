package com.sample.crud.withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class sampleTestForCompleteUpdateTest {
	@Test
	public void putDataToServer() {		
     JSONObject jsonObj=new JSONObject();
		
		jsonObj.put("createdBy", "DK");
		jsonObj.put("status", "Created");
		jsonObj.put("projectName", "learnRestassured");
		jsonObj.put("teamSize", 5);
		
		given()
		.contentType(ContentType.JSON)
		.body(jsonObj.toJSONString())
		.when()
		.put("http://49.249.28.218:8091/project/NH_PROJ_686")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}

}
