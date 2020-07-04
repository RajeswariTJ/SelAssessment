package week4.w4d2_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {
	
		
	public  static List<String> getWindowRef(ChromeDriver driver) {
		
		Set<String> windowHandles = driver.getWindowHandles(); 
		List<String> setToList = new ArrayList<String>(windowHandles);
		return setToList;
		}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Contacts']").click();
		driver.findElementByXPath("//a[text()='Merge Contacts']").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		
		List<String> List =getWindowRef(driver);
		
		driver.switchTo().window(List.get(1));
		driver.findElementByXPath("(//div/a[@class='linktext'])[1]").click();
		driver.switchTo().window(List.get(0));
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		List<String> list2 =getWindowRef(driver);
		driver.switchTo().window(list2.get(1));
		driver.findElementByXPath("(//div/a[@class='linktext'])[6]").click();
		driver.switchTo().window(list2.get(0));
		
		driver.findElementByXPath("//td/a[text()='Merge']").click();
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.accept();
		
		if(driver.getTitle().equals("Merge Contacts | opentaps CRM")) {
			System.out.println("Title of the page is verified successfully");
		}
		
		
		
		
		
		
			
			
	
		
		
	
		
		
		
		
		
	}

}
