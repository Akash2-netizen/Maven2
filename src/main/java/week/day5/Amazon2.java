package week.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon2 {

	private static WebElement condition;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		//To Load the link
	    driver.get("http://www.amazon.in/");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("realme 12 pro 5g",Keys.ENTER);
	    Thread.sleep(5000);
	   // driver.findElement(By.xpath("//span[text()='realme 12 Pro 5G (Submarine Blue, 8GB RAM 256 GB Storage)']")).click();
	    //driver.findElement(By.xpath("(//span[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style'][2])")).click();
	    //(//span[@class='a-size-medium a-color-base a-text-normal']) [2]
	    //driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal']) [2])")).click();
	    WebElement findElement = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal']) [2])"));
	    
	    Actions ac = new Actions(driver);
	    ac.scrollToElement(condition).perform();
	    Thread.sleep(5000);
	    

	    
	}

}
