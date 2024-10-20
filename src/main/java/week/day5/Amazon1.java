package week.day5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Amazon1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		//To Load the link
	    driver.get("http://www.amazon.in/");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 11R",Keys.ENTER);
	    Thread.sleep(5000);
		WebElement price=driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		String price1=price.getText();
		System.out.println(price1);
		WebElement ratings=driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));
		String ratings1=ratings.getText();
		System.out.println(ratings1);
		
		
		ratings.click();
		
		/*Thread.sleep(2000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snap/002.png");
		FileUtils.copyFile(source, destination);*/
		
		//Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		WebElement findElement = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(findElement);
		
		
		
		

		
		 
		
		
	}
	

}
