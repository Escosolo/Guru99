package newpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

		public WebDriver driver;
		
		@Before
		public void LoginTest(){
			
			//Go to chrome and open it
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Esco\\Documents\\Guru99\\chromedriver.exe");
			 driver = new ChromeDriver();
			 
		} 
			 //navigate to URL
			 @Test
			 public void LoginUser () {
			 driver.navigate().to("http://www.demo.guru99.com/V4/");
			 
			 driver.findElement(By.name("uid")).sendKeys("1303");
			 
			 driver.findElement(By.name("password")).sendKeys("Guru99");
			 
			 driver.findElement(By.name("btnLogin")).click();
		}
		
		
    }
	
	