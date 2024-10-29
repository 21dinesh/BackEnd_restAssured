package Practice.PostRequestTypes;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClassUtility.Project_POJO;

public class postRequest_Via_Pojoclass {

		@Test
		public void postDataToServer() {
		
		//File filsObj = new File("./pro.json");
		//create a object for pojo
		Random random =new Random();
		int ranNum= random.nextInt(900);
			Project_POJO pObj= new Project_POJO("BBC"+ranNum,  "DK","Created", 0);
			
		given().contentType(ContentType.JSON)
		.body(pObj)
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then().assertThat().statusCode(201)
		.log().all();
		
		}
	}

