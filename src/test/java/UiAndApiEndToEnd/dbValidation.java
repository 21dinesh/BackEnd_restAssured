package UiAndApiEndToEnd;



	import org.testng.annotations.Test;

	import io.restassured.http.ContentType;
	import io.restassured.response.Response;

	import static io.restassured.RestAssured.*;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Random;

	import org.json.simple.JSONObject;
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class dbValidation {

	    //Create a Project in Back end (API) layer and validate in Front end and Database

		String expProjectName = "FB_" + new Random().nextInt(1000);

		@Test
		public void sampleTest() throws InterruptedException, SQLException {

	        //Create a Project in Back end
			
			String expProName = "Test_" + new Random().nextInt(500);
			
			JSONObject jsonObj=new JSONObject();
			
			jsonObj.put("createdBy", "jack");
			jsonObj.put("status", "Created");
			jsonObj.put("projectName", expProName);
			jsonObj.put("teamSize", 0);
			
			Response response = given()
			.contentType(ContentType.JSON)
			.body(jsonObj)
			.when() 
			.post("http://49.249.28.218:8091/addProject");
			response.then().assertThat().statusCode(201)
			.log().all();	
			
			// Validate in Front end

			WebDriver driver = new ChromeDriver();

			driver.get("http://49.249.28.218:8091/");
			driver.manage().window().maximize();

			driver.findElement(By.id("username")).sendKeys("rmgyantra");
			driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();

			Thread.sleep(2000);
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath("//a[text()='Projects']"))).click().perform();
			
			WebElement sortEle = driver.findElement(By.xpath("//h2[text()='List of']/../following-sibling::div[@class='col-sm-6']/select[@class='form-control']"));
			Select sortSelect = new Select(sortEle);
			sortSelect.selectByVisibleText("Search by Project Name");

			driver.findElement(By.xpath("//input[@placeholder='Search by Project Name']")).sendKeys(expProjectName);
			
			Thread.sleep(2000);
			String actProjectName = driver.findElement(By.xpath("//tbody/tr[@class='tr']/td[2]")).getText();
			System.out.println(actProjectName);
			
			if(actProjectName.equals(expProjectName)) {
				System.out.println("Project validated successfully in frontend");
			} else {
				System.out.println("Frontend validation not done");
			}
			
			driver.quit();
			
			//Validate that Project in Database layer
//			
//			boolean flag = false;
//			Connection conn = DriverManager.getConnection("jdbc:mysql://106.51.90.215:3333/Projects", "root@%", "root");
//			ResultSet result = conn.createStatement().executeQuery("Select project_name from project");
//			while (result.next()) {
//				if (result.getString(1).equals(expProjectName)) {
//					flag = true;
//					break;
//				}
//			}
//	
//			if (flag) {
//				System.out.println( "data verified in Database table");
//			} else {
//				System.out.println( "data not verified in Database table");
//			}
		}
	}
	


