package com.LawyerWangu.Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class MyAccountlive {


	@FindBy(xpath="//a[.=\"My Account\"]")

	private WebElement MyAccount;


	@FindBy(xpath="//a[.=\"Address Book\"]")

	private WebElement AdrressBook;

	@FindBy(xpath="//a[.=\"Add New Contact\"]")

	private WebElement AddNewContact;

	@FindBy(id="name")

	private WebElement Entername;

	@FindBy(id="registered_mobile")

	private WebElement registered_mobile;

	@FindBy(id="registered_email")

	private WebElement registered_email;


	@FindBy(id="identity")
	
	private WebElement DropDownPassport;

	@FindBy(id="passport")

	private WebElement EnterpassportNo;
	
	
	@FindBy(xpath="//input[@id=\"po_box\"]")

	private WebElement Address;

	
	private JavascriptExecutor driver;
	

	@FindBy(xpath="//span[@id=\"submit_sub_details\"]")

	private WebElement SaveDetails;

	
	@FindBy(xpath="(//button [.=\"Remove\"])[1]")

	private WebElement RemoveContect;
	

	//@FindBy(id="remove-details")
	@FindBy(id="modal_dismiss")

	private WebElement RemovePopup;
	
	


	public MyAccountlive(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void Details()
	{
		MyAccount.click();
		Reporter.log("Click on My Account", true);

		AdrressBook.click();

		AddNewContact.click();
		Reporter.log("Add New Contact", true);

		Entername.sendKeys("Testabhi");

		registered_mobile.sendKeys("747458568");

		registered_email.sendKeys("Testabhi99@gmail.com");

		DropDownPassport.click();
	} 
	
	public void Passport() throws InterruptedException 
	{ 
		Select s=new Select(DropDownPassport); 
		s.selectByValue("Passport");
		EnterpassportNo.sendKeys("658259655");
		Thread.sleep(2000);
	}



	public void Address() throws InterruptedException {
		
		
		
		Thread.sleep(2000);
		Address.sendKeys("12 BTM");
		Thread.sleep(2000);

	}

	
	public void Save() throws InterruptedException {
		
		
		Thread.sleep(2000);
		SaveDetails.click();
		Reporter.log("Contact Created", true);
	}
	
	
	
	public void removecontect() throws InterruptedException {
		
	
		Thread.sleep(2000);
		RemoveContect.click();
		RemovePopup.click();
		
		
		Thread.sleep(2000);
		
		
	}
}
