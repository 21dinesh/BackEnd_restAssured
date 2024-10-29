package com.sample.crud.WithOutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class sampleTestForRead {
	@Test
	public void getDataFromServer() {
		Response resp = RestAssured.get("http://49.249.28.218:8091/projests");
	    //System.out.println(resp.prettyPrint());
		
		resp.then().assertThat().statusCode(200);
		
		resp.then().log().all();
	}

}
