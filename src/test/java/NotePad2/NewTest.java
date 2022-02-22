package NotePad2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	  driver.findElement(By.linkText("Add New User")).click();
	  driver.findElement(By.linkText("Back to Menu")).click();
	  driver.findElement(By.linkText("Edit")).click();
	  driver.findElement(By.linkText("Back to Dashboard")).click();
	  

 }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
