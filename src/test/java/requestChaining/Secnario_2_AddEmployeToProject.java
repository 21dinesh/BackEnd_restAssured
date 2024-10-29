package requestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassUtility.EmployeePOJO;
import pojoClassUtility.Project_POJO;

public class Secnario_2_AddEmployeToProject {
	@Test
	public void sampleTest() {
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
		String projectname=resp.jsonPath().get("projectName");
		System.out.println(projectname);
		
		//API_2 add employe to same project
		
		///String designation, String dob, String email, String empName, double experience,
		//String mobileNo, String project, String role, String username
	
		EmployeePOJO empObj = new EmployeePOJO("arch","24/09/1982","deeno@gmail.com","user_"+ranNum,20,"9983748390",projectname,"ROLE_EMP","ROLE_"+ranNum);
		given().contentType(ContentType.JSON)
		.body(empObj)
		.when()
		.post("http://49.249.28.218:8091/employees")
	     .then().assertThat().statusCode(201).log().all();
	
	}
}
