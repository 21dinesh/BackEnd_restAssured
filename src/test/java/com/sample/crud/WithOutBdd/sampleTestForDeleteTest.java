package com.sample.crud.WithOutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class sampleTestForDeleteTest {
	@Test
	public void deleteDataFromServer() {
		Response resp = RestAssured.delete("http://49.249.28.218:8091/projects/NH_PROJ_689");
		resp.then().assertThat().statusCode(405);
		resp.then().log().all();
		
	}

}
