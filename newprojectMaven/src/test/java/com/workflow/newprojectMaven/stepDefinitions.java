package com.workflow.newprojectMaven;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.google.common.io.Files;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;

public class stepDefinitions extends testBase {
	HomePage homePage= new HomePage(); 
	
	@Before
	public void setup() throws IOException {
		initialize();
	}
	
	@Given("^I go to the landing page$")
	public void i_go_to_the_landing_page() throws Throwable {
	    driver.get(CONFIG.getProperty("URL"));
	}

	@Given("^I enter username$")
	public void i_enter_username() throws Throwable {
		driver.findElement(By.name("uid")).sendKeys("1303"); 
	      
	}
	@Given("^I enter username \"([^\"]*)\"$")
	public void i_enter_username(String username) throws Throwable {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enter_username(username);	
	}
	 
	@Given("^I enter password$")
	public void i_enter_password() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("Guru99");
	}
	
	@Given("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String password) throws Throwable {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enter_password(password);	
	}
	@When("^I click on Login$")
	public void i_click_on_Login() throws Throwable {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.click_on_login_button();
	}
	
//	@Then("^I verify title$")
//	public void i_verify_title() throws Throwable {
//	    String title = driver.getTitle();
//	    System.out.println(title);
//	    Assert.assertEquals("Guru99 Bank Customer HomePage", title);
//	    
//	}
//	
	@Then("^I verify title of Homepage$")
	public void i_verify_title_of_Homepage() throws Throwable {
		String title = homePage.pageTitle();
		System.out.println(title);
		Assert.assertEquals("Guru99 Bank Customer HomePage",title );
	}
	
	
	//@Then("^I verify title \"([^\"]*)\" of HomePage$")
	//public void i_verify_title_of_HomePage(String title) throws Throwable {
	   // HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	    //homepage.i_verify_i_am_logged_in(title);
	//}
	
	

	@Then("^I click on sign out$")
	public void i_click_on_sign_out() throws Throwable {
		driver.findElement(By.linkText("Log out")).click();	
		
	}
	
	@Then("^I successfully Logout$")
	public void i_successfully_logout() throws Throwable {
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
	}	

	@And("^I see an error message$")
	public void i_see_an_error_message() throws Throwable {
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 alert.accept();
		 
	}	
	
	

}
