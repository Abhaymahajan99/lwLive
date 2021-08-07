package com.LawyerWangu.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.LawyerWangu.Pom.Loginlive;
import com.LawyerWangu.Pom.logout;



public class BaseClasslwlive {
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	public Filelibrary f= new Filelibrary();




	static {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe" );
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	}

	//@Parameters("browser")
	@BeforeTest
	//public void openBrowser(String browser) throws IOException{
	public void openBrowser() throws IOException{

		String url = f.getPropertyData("url");
		driver=new ChromeDriver();

		String browser =f.getPropertyData("browser");

		/*
		 * if (browser.equalsIgnoreCase("chrome")) { driver=new ChromeDriver();
		 * Reporter.log("Chrome Launched", true); } else if
		 * (browser.equalsIgnoreCase("firfox")) { driver=new FirefoxDriver();
		 * Reporter.log("Firefox Launched", true);
		 * 
		 * } else if(browser.equalsIgnoreCase("edge"))
		 * 
		 * { driver = new EdgeDriver(); Reporter.log("edge Launched", true); }
		 */

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
		wait =new WebDriverWait(driver,10);
		driver.get(url);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	@BeforeMethod

	public void Login() throws IOException, InterruptedException {


		String un = f.getPropertyData("username");
		String pw =f.getPropertyData("password"); 
		Loginlive l=new Loginlive(driver); 
		l.setLoginpass(un, pw);
		Reporter.log("Login Account", true);

		Thread.sleep(4000);

	}




	@AfterMethod
	public void logoutlive() {
		logout lg=new logout(driver);
		lg.Setlogout();

	}

}
