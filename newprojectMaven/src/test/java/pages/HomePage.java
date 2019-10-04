package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.testBase;
import junit.framework.Assert;

public class HomePage extends testBase {
	
	//@FindBy(how=How.XPATH, using = "//marquee")
	//public static WebElement homepageTitle;
	
	//public void i_verify_i_am_logged_in(String title){
		
		//Assert.assertEquals(title , homepageTitle.getText());
		
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
		 public String pageTitle() {
			 return driver.getTitle();
		 }
	}
		
	