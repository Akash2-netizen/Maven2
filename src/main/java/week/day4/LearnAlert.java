package week.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0wp4yggz5ikn51wjgrja8jnf8p540318.node0");
		//Maximize the chrome browser
		driver.manage().window().maximize();

		//click on show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//Handle an alert
		Alert simpleAlert = driver.switchTo().alert();
		//accept the alert
		simpleAlert.accept();

		//click on show button
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Thread.sleep(3000);
		//Handle an alert
		Alert confirmAlert = driver.switchTo().alert();
		//accept the alert
		confirmAlert.dismiss();
		

//sweet Alert
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Alert sweetAlert = driver.switchTo().alert();
		//accept the alert
		sweetAlert.dismiss();
	}

}
