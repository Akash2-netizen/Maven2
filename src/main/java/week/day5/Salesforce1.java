package week.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v118.dom.model.ShadowRootPopped;

import io.github.sukgu.Shadow;

public class Salesforce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://developer.salesforce.com/signup");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    /*Shadow shad= new Shadow(driver);
	    shad.findElementByXPath("//input[@name='first_name']").sendKeys("Akash");
	    Shadow shad1= new Shadow(driver);
	    shad1.findElementByXPath("//input[@name='first_name']").sendKeys("Akash");*/
	    
	    
	}

}
