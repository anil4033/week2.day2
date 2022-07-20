package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//to call WDM for driver
		WebDriverManager.chromedriver().setup();
		
		//Launch browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		
		driver.get("https://www.zoomcar.com");
		
		//Maximize browser
		
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(2000);
		//Click Country
	    driver.findElement(By.xpath("//div[@class='multiselect__select']")).click(); 
		driver.findElement(By.xpath("//span[text()='India']")).click();
		
		Thread.sleep(1000);
		//Click City
		driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
		
		//Click Confirm
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		Thread.sleep(1000);
	
		//Click on Pickup City 
		driver.findElement(By.xpath("//div[@class='placeholder']")).click();
		
		//Click the fist suggested pick up location 
		driver.findElement(By.xpath("(//div[@class='ellipsis'])[1]")).click();
		
		//Click on Calander date
		driver.findElement(By.xpath("//span[@class='field-date start-time']")).click();
		
		//Click on Date 19 (twice) 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
		
		//Click Continue 
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
				
		//Click Find Cars 
		driver.findElement(By.xpath("//button[contains(text(),'Find cars')]")).click();
				
		//Find the price of maruti swift dzire
		
		String price = driver.findElement(By.xpath("//h3[text()='Maruti Swift Dzire']/following::div[@class='price-book-ctr']/div/div[1]")).getText();
        System.out.println(price);
	}

}
