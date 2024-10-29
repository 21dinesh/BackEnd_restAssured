package workingWithGraphQl;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class getAllProject {
	@Test
	public void graphQlTest() {
 	String graphQlQuery="{ findProject(projectId:\"NH_PROJ_985\")"
 			+ "{ projectId"
 			+ " projectName"
 			+ " status"
 			+ " createdBy"
 			+ " teamSize}"
 			+ " }";
	
Response res = given().header("ContentType","application/json")
.body(graphQlQuery)
.post("http://49.249.28.218:8091/getAll");
String responseBody = res.getBody().asString();
System.out.println(responseBody);
res.then().log().all();
	
}
}


