package NotePad2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\chromedriver.exe");

	   // define the drive instance
	  WebDriver driver = new ChromeDriver();
	  // nagivate the browser to this url
	  driver.get("http://localhost:8090/NotePad2/NoteServlet/dashboard");
	  // browser look for link with text value
	  
	  // add new user
//	  driver.findElement(By.linkText("Add New User")).click();	  
//	  WebElement name =  driver.findElement(By.name("userName"));
//	  WebElement title =  driver.findElement(By.name("title"));
//	  WebElement description = driver.findElement(By.name("description"));
//	  WebElement submit = driver.findElement(By.name("submit"));
//	  name.sendKeys("Tars");
//	  title.sendKeys("TESTNG");
//	  description.sendKeys("This is for Testing TESTNG");
//	  submit.click();
	  
	  
	  //Edit
//	  WebElement edit = driver.findElement(By.name("editTars"));
//	  edit.click();
//	  WebElement EditTitle = driver.findElement(By.name("title"));
//	  WebElement EditDetails = driver.findElement(By.name("details"));
//	  WebElement update = driver.findElement(By.name("update"));
//	  EditTitle.clear();
//	  EditDetails.clear();
//	  EditTitle.sendKeys("Edited Title");
//	  EditDetails.sendKeys("Edited Distails");
//	  update.click();
	  
//	  
//	  //delete
	  WebElement delete = driver.findElement(By.name("deleteTars"));
	  delete.click();
	  

 }
  @BeforeTest
  public void beforeTest() {

  }

  @AfterTest
  public void afterTest() {
  }

}
