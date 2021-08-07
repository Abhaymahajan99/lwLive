package com.LawyerWangu.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DocumentTillPriviewPage {
	

	static {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor j= (JavascriptExecutor) driver;
		driver.get("https://www.lawyerwangu.com/lw/test-payment");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[.='Myself']")).click();
		
		driver.findElement(By.xpath("//input[@id='login_username']")).sendKeys("testerwangu001");
		driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("monika123");
		Thread.sleep(500);
		
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signin-popup-btn']"))).click();
		//driver.findElement(By.xpath("//input[@id='signin-popup-btn']")).click();
		
		String c="window.scrollTo(0,document.body.scrollHeight)";
		j.executeScript(c);
		
		 WebElement l = driver.findElement(By.xpath("//input[@id='document-name']"));
	        l.sendKeys("TestDoc");
	        //refresh page
	        driver.navigate().refresh();
	        //fix exception with try−catch block
	        try{
	           l.sendKeys("TestDoc");
	        }
	        catch(StaleElementReferenceException e){
	           l = driver.findElement(By.xpath("//input[@id='document-name']"));
	           l.sendKeys("TestDoc");
	       
	        }
	        driver.findElement(By.xpath("//input[@id='page-next-1']")).click();
		
		
		//WebDriverWait wait2 =new WebDriverWait(driver,20);
		//wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='document-name']"))).sendKeys("TestDoc");
		//driver.findElement(By.xpath("//input[@id='document-name']")).sendKeys("TestDoc");
		
		
		
		
	        driver.findElement(By.xpath("(//input[@placeholder='Select date as dd/mm/yyyy'])[1]")).sendKeys("03-08-1995");
			driver.findElement(By.xpath("//input[@placeholder='Select time']")).sendKeys("11:12 AM");
			driver.findElement(By.xpath("//input[@placeholder='Enter the amont']")).sendKeys("50000");
			Thread.sleep(500);
			String b="window.scrollTo(0,document.body.scrollHeight)";
			j.executeScript(b);
			
			driver.findElement(By.xpath("(//input[@placeholder='Select date as dd/mm/yyyy'])[2]")).sendKeys("03-07-1995");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='page-next-2']")).click();
			
			
			WebElement DropDown = driver.findElement(By.xpath("//select[contains(@id,'select-1619783071804')]"));
			
			Select s=new Select(DropDown);
			s.selectByValue("Passport");
			
			
			driver.findElement(By.xpath("//input[@placeholder='Enter name as it appears on Document']")).sendKeys("986523256");
			
			
			String a="window.scrollTo(0,document.body.scrollHeight)";
			j.executeScript(a);
			
			driver.findElement(By.xpath("//input[@id='page-next-3']")).click();
			
			String e="window.scrollTo(0,document.body.scrollHeight)";
			j.executeScript(e);
			
			driver.findElement(By.xpath("//input[@id='page-next-4']")).click();
			
			String z="window.scrollTo(0,document.body.scrollHeight)";
			j.executeScript(z);
			
			driver.findElement(By.xpath("//input[@id='page-next-5']")).click();
			
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//canvas[@id='canvas-1'] ")));
			
			String f="window.scrollTo(0,document.body.scrollHeight)";
			j.executeScript(f);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Proceed to Purchase']"))).click();
			
			System.out.println("Document Till Priview Page Test Pass");
			
			driver.findElement(By.xpath("//button[.='Proceed to Payment']")).click();
			
			System.out.println("Proceed to Payment");
			
			driver.quit();
		}

}
