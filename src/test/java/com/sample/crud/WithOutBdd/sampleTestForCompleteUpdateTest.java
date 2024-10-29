package com.sample.crud.WithOutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class sampleTestForCompleteUpdateTest {
	@Test
	public void putDataToServer() {		
		JSONObject jsonObj= new JSONObject();
		
		jsonObj.put("createdBy", "dinesh");
		jsonObj.put("status", "Created");
		jsonObj.put("teamSize", 10);
		jsonObj.put("projectName", "learnRestAssured_003");
		
		RequestSpecification Req = RestAssured.given();
		Req.contentType(ContentType.JSON);
		Req.body(jsonObj.toJSONString());
		
		Response resp = Req.put("http://49.249.28.218:8091/project/NH_PROJ_686");
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
	}
	

}
