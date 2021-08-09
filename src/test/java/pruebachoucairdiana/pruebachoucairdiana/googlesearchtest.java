package pruebachoucairdiana.pruebachoucairdiana;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearchtest {
	private WebDriver driver;
	
	By usernameLocator = By.id("email");
	By passwordlocator = By.id("passwd");
	By signinBtnlocator= By.id("SubmitLogin");
	
	
	

@Before
public void setUp () {

    
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	}

@Test
public void testGooglepage(){

	WebElement searchbox = driver.findElement(By.className("login"));
	searchbox.click();
	
  driver.findElement(usernameLocator).sendKeys("dife.flaca@gmail.com");
  driver.findElement(passwordlocator).sendKeys("fercha8905.");
  
  driver.findElement(signinBtnlocator).click();
 

  

	
	
	
	
}
	
@After
public void tearDown() {
//driver.quit();	
}	
	
private void assertEquals(String string, String title) {
	// TODO Auto-generated method stub
	
}

}