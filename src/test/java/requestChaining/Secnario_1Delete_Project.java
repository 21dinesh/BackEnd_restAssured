package requestChaining;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassUtility.Project_POJO;

public class Secnario_1Delete_Project  {
	@Test
	public void postDataToServer() {
	
	//File filsObj = new File("./pro.json");
		
	//create a object for pojo
	Random random =new Random();
	int ranNum= random.nextInt(900);
	
	//Api_1 add project in side server 
		Project_POJO pObj= new Project_POJO("ProNew"+ranNum,"DK","Completed",0);
		
     Response resp = given().contentType(ContentType.JSON)
	.body(pObj)
	.when()
	.post("http://49.249.28.218:8091/addProject");
	resp.then().assertThat().statusCode(201)
	.log().all();
	
	//capture project name for the responce
	String projectID=resp.jsonPath().get("projectId");
	System.out.println(projectID);
	
	//API_2 delete project
	given().delete("http://49.249.28.218:8091/project/"+projectID)
	
	.then()
	.log().all();
	
	
	
	
	}
}
