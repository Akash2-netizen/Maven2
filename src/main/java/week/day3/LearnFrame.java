package week.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		//To Load the link
	    driver.get("https://leafground.com/frame.xhtml");
	    //To maximize the chrome window
	    driver.manage().window().maximize();
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("Click")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(1);
	    driver.findElement(By.id("Click")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(2);
	    driver.switchTo().frame(0);
	    
	    driver.findElement(By.id("Click")).click();
	}
	
}
