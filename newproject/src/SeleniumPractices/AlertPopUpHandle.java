package SeleniumPractices;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	

	public WebDriver driver;
	
	@Before
	public void LoginTest() {
		
		//Go to chrome and open it
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Esco\\Documents\\Guru99\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		 
	}
	@Test
	public void LoginUser() throws InterruptedException{
		
		 driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");  
		 
		 driver.findElement(By.name("proceed")).click();
		 
		 Thread.sleep(5000);
		 
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 
		 alert.accept(); //click on OK btn
	
		 //alert.dismiss(); //click on cancel btn
	}
	} 

