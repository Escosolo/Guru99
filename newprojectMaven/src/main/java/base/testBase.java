package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testBase {

	//initializing the property file reading
	public static Properties CONFIG=null;
	public static WebDriver driver=null;
	public int random;
	
	public void initialize() throws IOException{
	if(driver == null){
	
	//config property file
	CONFIG = new Properties();
	FileInputStream fn =new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/config.properties");
	CONFIG.load(fn);
			
	//initializing the WebDriver
	if (CONFIG.getProperty("browser").equals("firefox")){
		driver = new FirefoxDriver();
		
	}else if(CONFIG.getProperty("browser").equals("edge")){
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
	}else if (CONFIG.getProperty("browser").equals("chrome")){
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Esco\\Documents\\Guru99\\chromedriver.exe");
		    driver = new ChromeDriver();	
	}
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	}

	@After
	public void tearDown() throws IOException {
		driver.quit();
	}
	}
