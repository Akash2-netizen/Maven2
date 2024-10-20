package week.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://login.salesforce.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("ragunath.testleaf@gmail.com");
driver.findElement(By.name("pw")).sendKeys("Testleaf@123");
driver.findElement(By.name("Login")).click();
driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
driver.findElement(By.xpath("//button[text()='View All']"));
	}

}
