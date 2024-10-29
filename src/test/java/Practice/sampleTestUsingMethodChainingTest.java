package Practice;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class sampleTestUsingMethodChainingTest {
	@Test
	public void GetReqTest() {
		get("https://reqres.in/api/users?page=2")
        .then()
        .log()
        .all();
		//Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
	    // System.out.println(resp.prettyPrint());	
	}

}
