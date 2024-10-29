package com.sample.crud.withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class cookies {
	@Test
	public void putDataToServer() {		
		
		given().cookie("username","dk")
		.when().patch("http://49.249.28.218:8091/project/NH_PROJ_689")
	.then().log().all();
		
	} 
	

}
