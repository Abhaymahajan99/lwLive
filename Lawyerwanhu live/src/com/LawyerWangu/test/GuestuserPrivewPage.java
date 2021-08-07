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

public class GuestuserPrivewPage {

	static {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		JavascriptExecutor j= (JavascriptExecutor) driver;
		driver.get("https://www.lawyerwangu.com/lw/test-payment");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//label[.='Others'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys("GuestUser");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("GuestUser@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7458569525");
		driver.findElement(By.xpath("//input[@id='document-name']")).sendKeys("TestDoc");


		driver.findElement(By.xpath("//input[@id='page-next-1']")).click();

		driver.findElement(By.xpath("(//input[@placeholder='Select date as dd/mm/yyyy'])[1]")).sendKeys("03-08-1995");

		driver.findElement(By.xpath("//input[@placeholder='Select time']")).sendKeys("11:12 AM");
		driver.findElement(By.xpath("//input[@placeholder='Enter the amont']")).sendKeys("50000");
		Thread.sleep(500);
		String b="window.scrollTo(0,document.body.scrollHeight)";
		j.executeScript(b);

		driver.findElement(By.xpath("(//input[@placeholder='Select date as dd/mm/yyyy'])[2]")).sendKeys("03-07-1995");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='page-next-2']")).click();

		WebDriverWait wait =new WebDriverWait(driver,20);
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
		
		driver.findElement(By.xpath("//a[@id='cn-accept-cookie']")).click();

		driver.findElement(By.xpath("//button[.='Proceed to Payment']")).click();

		System.out.println("Proceed to Payment");
		
		driver.findElement(By.xpath("//button[.='Continue as Guest User']")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.name("guest_email")).sendKeys("testerwangu002@gmail.com");
		
		driver.findElement(By.xpath("//label[@for='same-address1']")).click();
		String g="window.scrollTo(0,document.body.scrollHeight)";
		j.executeScript(g);
		
		driver.findElement(By.xpath("//button[.='Ok']")).click();
		
		driver.findElement(By.id("guest_login_button")).click();
		
		System.out.println("Guest user till OTP");
		
		
		driver.quit();
		
	}
	
}
