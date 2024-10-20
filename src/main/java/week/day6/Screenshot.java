package week.day6;

import java.nio.file.FileSystem;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.get("http://www.amazon.in/");

//Screenshot take=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//ImageIO.write(take.getImage() "PNG", new File(System.getProperty("user.dir")+ " \\snap\\AmazonPage.png"));

	}

}
