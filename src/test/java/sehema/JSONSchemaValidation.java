package sehema;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import java.io.File;
import java.util.Random;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JSONSchemaValidation {
	@Test
	public void postDataToServer() {		
		JSONObject jsonObj= new JSONObject();
		
		jsonObj.put("createdBy", "Dinesh");
		jsonObj.put("status", "Created");
		jsonObj.put("teamSize", 0);
		jsonObj.put("projectName", "HeaderResponse"+new Random().nextInt(1000));
		
		RequestSpecification Req = RestAssured.given();
		Req.contentType(ContentType.JSON);
		Req.body(jsonObj.toJSONString());
		
		Response resp = Req.post("http://49.249.28.218:8091/addProject");
		resp.then().log().all();
		resp.then().assertThat().statusCode(201);
		
		resp.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File("./src/test/resources/jsonschema.json")));
	}

}
