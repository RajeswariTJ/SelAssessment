package week4D1.w4d1_assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	WebElement frame = driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[1]");
	driver.switchTo().frame(frame);
	driver.findElementByXPath("//body[contains(text(),'I am inside a frame')]/button").click();
	driver.switchTo().defaultContent();
	
	WebElement frame2 = driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[2]");
	driver.switchTo().frame(frame2);
	driver.switchTo().frame("frame2");
	driver.findElementByXPath("//body[contains(text(),'I am inside a nested frame')]/button").click();
	driver.switchTo().defaultContent();
	List<WebElement> frames = driver.findElementsByXPath("//iframe");
	System.out.println("Total No. of frames in page:"+ frames.size());
		
	}
}
