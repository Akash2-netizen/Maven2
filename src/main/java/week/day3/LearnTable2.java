package week.day3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		//To Load the link
	    driver.get("https://erail.in/");
	    driver.manage().window().maximize();
	   WebElement source1=driver.findElement(By.id("txtStationFrom"));
	   source1.clear();
	   source1.sendKeys("Mgr Chennai",Keys.ENTER);
	   WebElement source2=driver.findElement(By.id("txtStationTo"));
	   source2.clear();
	   source2.sendKeys("Mdu",Keys.ENTER);
	   driver.findElement(By.id("chkSelectDateOnly")).click();
	   List<WebElement> trainName= driver.findElements(By.xpath("//table[contains(@class,'DataTable')]//tr/td[2]"));
		for(int i=0;i<trainName.size();i++)
		{
		//System.out.println(trainName.get(i).getText());
		String text1=driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList TrainListHeader stickyListHeader']//tr["+i+"]/td[2]")).getText();
		System.out.println(text1);
		}
	}
	   
	}


