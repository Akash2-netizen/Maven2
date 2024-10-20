package testng.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LeafTabsCreateLead {
@Test
	public void create() {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		//To Load the link
	    driver.get("http://leaftaps.com/opentaps/control/login");
	    //To maximize the chrome window
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //To Enter the username and password
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    //To click the submit button
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	  //Enter the Company Name
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	  		
	  //Enter the First Name
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoth");
	  		
	  //Enter The Last Name
	  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	  		
	  //Click on the Create Leads Button
	  driver.findElement(By.name("submitButton")).click();
	}

}
