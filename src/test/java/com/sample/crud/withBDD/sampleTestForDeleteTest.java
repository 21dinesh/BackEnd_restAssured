package com.sample.crud.withBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class sampleTestForDeleteTest {
	@Test
	public void deleteDataFromServer() {
		given().delete("http://49.249.28.218:8091/projects/NH_PROJ_686")
		.then().assertThat().statusCode(204)
		.log().all();
		
	}

}
