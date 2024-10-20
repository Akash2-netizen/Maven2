package week.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement findElement = driver.findElement(By.xpath("//input[@id='username']"));
        
        
	    File src = findElement.getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/img.png");
		FileUtils.copyFile(src, des);
		

	 
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ragunath.testleaf@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf@123");
	    driver.findElement(By.xpath("//input[@id='Login']")).click();
	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    WebElement element = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", element);

		
				element.click();
		
		
		
		
	    driver.findElement(By.xpath("//div[text()='New']")).click();
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Ganesh");
	    WebElement element2 = driver.findElement(By.xpath("//legend [text()='Shipping Address']"));
		Actions move = new Actions(driver);
		move.scrollToElement(element2).perform();
		
		driver.findElement(By.xpath("(//span[text()='--None--'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

}
