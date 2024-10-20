package week.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		//To Load the link
	    driver.get("https://leafground.com/window.xhtml");
	    //To maximize the chrome window
	    driver.manage().window().maximize();
	    String parentWindow=driver.getWindowHandle();
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//span[text()='Open']")).click();
	    
	    Set<String> childWindow=driver.getWindowHandles();
	    
	    List<String> openedWindow=new ArrayList<String>(childWindow);
	    driver.switchTo().window(openedWindow.get(1));
	    System.out.println(driver.getTitle());
	   
	    
	}

}
