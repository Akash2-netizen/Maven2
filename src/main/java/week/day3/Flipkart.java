package week.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		//To Load the link
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("5G Mobiles",Keys.ENTER);
	    Thread.sleep(5000);
		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		List<Integer> mobileprice=new ArrayList<Integer>();
		for (int i=0; i<priceList.size(); i++) {
			
			String text=priceList.get(i).getText();
			String replace=text.replaceAll("[^0-9]","");
			int parseInt=Integer.parseInt(replace);
			System.out.println(replace);
			mobileprice.add(parseInt);
		}
		Integer min=Collections.min(mobileprice);
		System.out.println("Minimum price: "+min);
		
		Integer max=Collections.max(mobileprice);
		System.out.println("Minimum price: "+max);
	}

}
