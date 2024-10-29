package com.sample.crud.WithOutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class sampleTestForCreateTest {
	@Test
	public void postDataToServer() {		
		JSONObject jsonObj= new JSONObject();
		
		jsonObj.put("createdBy", "Dinesh");
		jsonObj.put("status", "Created");
		jsonObj.put("teamSize", 0);
		jsonObj.put("projectName", "HeaderResponse");
		
		RequestSpecification Req = RestAssured.given();
		Req.contentType(ContentType.JSON);
		Req.body(jsonObj.toJSONString());
		
		Response resp = Req.post("http://49.249.28.218:8091/addProject");
		resp.then().log().all();
		resp.then().assertThat().statusCode(201);
	}
	

}
