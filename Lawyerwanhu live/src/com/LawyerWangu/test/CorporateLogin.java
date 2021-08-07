package com.LawyerWangu.test;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.LawyerWangu.Pom.InternalLogin;
import com.LawyerWangu.generics.BaseClasslwlive;

public class CorporateLogin extends BaseClasslwlive {
	
	@Test
	
	public void login() throws Exception  {
		
		String c="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(c);
		
		InternalLogin l= new InternalLogin(driver);
		l.Internallogin();
		Reporter.log("Internal Login Pass", true);
		
		/*
		 * driver.get("https://www.lawyerwangu.com/lw/test-payment");
		 * driver.findElement(By.xpath("//label[.='Myself']")).click();
		 * driver.findElement(By.xpath("//input[@value='Next']")).click();
		 * driver.findElement(By.xpath("//input[@value='Next']")).click();
		 * driver.findElement(By.xpath("//input[@value='Next']")).click();
		 * driver.findElement(By.xpath("//input[@value='Next']")).click();
		 * driver.findElement(By.xpath("//input[@value='Next']")).click();
		 * driver.findElement(By.xpath("//input[@value='Proceed to Purchase']")).click()
		 * ; driver.findElement(By.xpath("(//a[.='My Account'])[1]")).click();
		 */
		
		
	}
	

}
