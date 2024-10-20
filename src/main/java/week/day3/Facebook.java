package week.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		//To Load the link
	    driver.get("https://en-gb.facebook.com/");
	    //To maximize the chrome window
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.linkText("Create new account")).click();
	    
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akash");
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8825460614");
	    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("pws");
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
	    WebElement source=driver.findElement(By.name("birthday_day"));
	    Select obj=new Select(source);
	    obj.selectByIndex(5);
	    WebElement source1=driver.findElement(By.name("birthday_month"));
	    Select obj1=new Select(source1);
	    obj1.selectByIndex(8);
	    WebElement source2=driver.findElement(By.name("birthday_year"));
	    Select obj2=new Select(source2);
	    obj2.selectByIndex(20);
	}

}
