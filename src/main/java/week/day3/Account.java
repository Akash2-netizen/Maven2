package week.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To open chrome browser
				ChromeDriver driver =new ChromeDriver();
				//To Load the link
			    driver.get("http://leaftaps.com/opentaps/control/login");
			    //To maximize the chrome window
			    driver.manage().window().maximize();
			    //To Enter the username and password
			    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			    driver.findElement(By.id("password")).sendKeys("crmsfa");
			    //To click the submit button
			    driver.findElement(By.className("decorativeSubmit")).click();
			    //To click the link to go into next page
			    driver.findElement(By.partialLinkText("CRM/SFA")).click();
			    //To click the contact link
			    driver.findElement(By.linkText("Accounts")).click();
			    //To click the create contact link
			    driver.findElement(By.linkText("Create Account")).click();
			    //To Enter the first name,local name,annual revenue
			    driver.findElement(By.id("accountName")).sendKeys("Akash");
			    driver.findElement(By.id("annualRevenue")).sendKeys("one lakh");
			    driver.findElement(By.id("groupNameLocal")).sendKeys("Ak");
	}

}
