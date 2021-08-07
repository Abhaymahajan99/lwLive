package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//Driver.get("https://www.trade.ekbazaar.com");
		driver.get("https://tradebazaar.tech-active.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"not-active-head\"]/div[2]/div/div[5]/a[2]/button")).click();//Register Button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/form/div[2]/div/input")).sendKeys("1095190469");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/form/div[3]/input")).click();//Submit Button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/form/div[3]/div/div[1]/input")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/form/div[3]/div/div[2]/input")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/form/div[3]/div/div[3]/input")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/form/div[3]/div/div[4]/input")).sendKeys("4");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/form/div[4]/input")).click(); //
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/form/div[2]/div/input")).sendKeys("Active@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/form/div[4]/div/input")).sendKeys("Active@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/form/div[5]/input[2]")).click();//Submit
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/form/div[5]/input[1]")).click();//Cancel
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("Ankita");
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).sendKeys("ankita.t@active.agency");
		
		
		driver.findElement(By.xpath("//div[@id='']//div[@id='']")).click();

		List<WebElement> AllOptions = driver.findElements(By.xpath("(//div[@id='']//div[@id=''])[1]")); //selecting Country

		for(int i = 0; i<=AllOptions.size()-1; i++) {
			if(AllOptions.get(i).getText().contains("India")) { 
				AllOptions.get(i).click();
				
			  

			} 
		}

		/*driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]")).click();

		
		
		List<WebElement>Alloptions=driver.findElements(By.xpath("//div[@class='role__single-value css-1lt0c-singleValue']"));
		
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("driver.findElement(By.xpath("(//div[@class=\"role__placeholder css-1wa3eu0-placeholder\"])[1]")).click();
		driver.findElement(By.xpath("(//div[.='karnataka'])")).click();")));
		
		System.out.println(Alloptions.size());
		for(int j=0; j<=Alloptions.size()-1 ; j++) {
			
			if(Alloptions.get(j).getText().contains("Bengaluru,Karnataka")) {
				Alloptions.get(j).click();
				
				driver.findElement(By.xpath("Submit & Continue")).click();*/
		
		driver.findElement(By.xpath("//div[@class='role__control css-1ljejhw-Control']")).click();
		
		driver.findElement(By.xpath("(//div[.='Bengaluru,Karnataka'])")).click();
		
		
		driver.findElement(By.xpath("//input[@value='Submit & Continue']")).click();




	}
}

