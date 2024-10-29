package com.sample.crud.WithOutBdd;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class sampleTestForPartialUpdateTest {
	@Test
	public void putDataToServer() {		
		JSONObject jsonObj= new JSONObject();

		jsonObj.put("projectName", "learnRA_9");
		
		RequestSpecification Req = RestAssured.given();
		Req.contentType(ContentType.JSON);
		Req.body(jsonObj.toJSONString());
		
		Response resp = Req.patch("http://49.249.28.218:8091/project/NH_PROJ_689");
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
	} 
	

}
