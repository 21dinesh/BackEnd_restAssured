package UiAndApiEndToEnd;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class uiAutomation {
	
	@Test
	public void uiTest() throws InterruptedException {	
	String expPname= "testPro_"+new Random().nextInt(100);
	WebDriver driver = new ChromeDriver();
    driver.get("http://49.249.28.218:8091");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    driver.findElement(By.id("username")).sendKeys("rmgyantra");
    driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
    driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    
   
    Thread.sleep(3000);
    driver.findElement(By.linkText("Projects")).click();
    
    driver.findElement(By.xpath("//span[text()='Create Project']")).click();
	driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(expPname);
	
	driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("UIProJect1");
    Thread.sleep(3000);
    WebElement droupdown = driver.findElement(By.xpath("//label[text()='Project Status* ']/following-sibling::select"));
    Select drp= new Select(droupdown);
	drp.selectByVisibleText("Created");
    Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@value='Add Project']")).click();
	Thread.sleep(2000);
	
	WebElement toNameDrp = driver.findElement(By.xpath("//h2['List of']/../following-sibling::div[@class]/select"));
	Select toPRO= new Select(toNameDrp);
	toPRO.selectByVisibleText("Search by Project Name");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Search by Project Name']")).sendKeys(expPname);
	
	String actPid = driver.findElement(By.xpath("//tr[@class='tr']/td[1]")).getText();
	driver.quit();
	 
	Response response = given().contentType(ContentType.JSON).when().get("http://49.249.28.218:8091/projects/");
     response.then().assertThat().statusCode(201).log().all();
     
     Assert.assertEquals(actPid, null);
	
	
	
	
	
	
	
	
	
	}
}
