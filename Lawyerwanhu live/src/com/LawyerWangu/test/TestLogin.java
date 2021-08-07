package com.LawyerWangu.test;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;


import com.LawyerWangu.Pom.MyAccountlive;
import com.LawyerWangu.generics.BaseClasslwlive;


public class TestLogin extends BaseClasslwlive{
	@Test
	public void test() throws Exception   {
		
		
		Thread.sleep(500);
		
		MyAccountlive m= new MyAccountlive(driver);
		
		m.Details();
		Thread.sleep(500);
		m.Passport();
		Thread.sleep(2000);
		m.Address();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-500)");
		
        m.Save();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button [.=\\\"Remove\\\"])[1]")));
		m.removecontect();
		Reporter.log("MyAccount Pass", true); 	
	
	}

}
