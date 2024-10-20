package week.day5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheapOair {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.cheapoair.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='suggestion-box__clear icon'])[2]")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		driver.findElement(By.xpath("//div[text()='Singapore']")).click();
		driver.findElement(By.xpath("(//input[@class='form-control'])")).click();
		WebElement element1 = driver.findElement(By.xpath("//a[@aria-label='18 April 2024']"));
		driver.executeScript("arguments[0].click();", element1);
		WebElement element2 = driver.findElement(By.id("travellerButton"));
		driver.executeScript("arguments[0].click();", element2);
		
		driver.findElement(By.id("addadults")).click();
		driver.findElement(By.id("closeDialog")).click();
		driver.findElement(By.xpath("//input[@id='searchNow']"));
		driver.findElement(By.xpath("//input[@id='new-input']"));
		
		
		
	}

}
