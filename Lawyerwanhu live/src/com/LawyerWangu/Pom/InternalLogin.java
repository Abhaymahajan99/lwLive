package com.LawyerWangu.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class InternalLogin {
	
	
	@FindBy(xpath="//a[contains(text(),'Corporate Login')]")
	private WebElement CorporateLogin;
	
	@FindBy(name="login_username")
	private WebElement username;
	
	@FindBy(name="login_password")
	private WebElement password;
	
	@FindBy(id="login_button")
	private WebElement button;
	

	public InternalLogin(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}

	public void Internallogin() {
		
		 CorporateLogin.click();
		 Reporter.log("Open CorporateLogin ", true);
		 username.sendKeys("devtest_internal");
		
		 
		 password.sendKeys("monika123");
		
		 
		 button.click();
		 
	}
}
