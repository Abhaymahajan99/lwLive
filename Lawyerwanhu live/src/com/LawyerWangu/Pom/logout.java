package com.LawyerWangu.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {

	@FindBy(linkText="Sign Out")
	private WebElement SignOut;
	

	public  logout(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void Setlogout()
	{
		SignOut.click();
	}
	

}
