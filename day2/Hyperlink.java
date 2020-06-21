package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		// Go to home page
		driver.findElementByXPath("//a[text()='Go to Home Page']").click();
		driver.findElementByXPath("//img[@alt='Link']").click();
		
		//Find where am supposed to go without clicking me?
		System.out.println("Find where am supposed to go without clicking me?");		
		System.out.println(driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href"));
		
		 //Verify am I broken
		 System.out.println("\nVerify am I broken?"); 
		 String linktext = driver.findElementByLinkText("Verify am I broken?").getAttribute("href");
		 
		if(linktext.contains("error")) {
			System.out.println("Link is broken");
		}else {
			System.out.println("Link is not broken");
		}
		
		// Go to home page(Interact with the same link name)
		driver.findElementByXPath("//a[text()='Go to Home Page']").click();
		driver.findElementByXPath("//img[@alt='Link']").click();
		
		// find how many links are there in the page
		 System.out.println("\nFind how many links are there in this page");
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 int linkCount = links.size();
		 System.out.println("Link count: "+linkCount);
		
		driver.close();
}

}
