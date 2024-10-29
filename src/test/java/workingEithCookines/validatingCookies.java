package workingEithCookines;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class validatingCookies {
	@Test
	public void cookieTest() {
		given().when().get("https://www.google.com/")
		.then().cookie("NID")
		.cookie("AEC").log().all();
		
	}

}
