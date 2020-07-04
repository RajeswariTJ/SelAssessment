package week4.w4d2_assignments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme {
	public static void main(String[] args) {
		
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://acme-test.uipath.com/account/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB,"leaf@12",Keys.TAB,Keys.ENTER);
			
			WebElement vendorsWEle= driver.findElementByXPath("(//button/i)[5]");
			
			Actions mouseOver = new Actions(driver);
			
			mouseOver.moveToElement(vendorsWEle)
			.click(driver.findElementByXPath("//a[text()='Search for Vendor']")).perform();
			
			driver.findElementById("vendorName").sendKeys("Blue Lagoon",Keys.TAB,Keys.ENTER);
			
			List<WebElement> keys = driver.findElementsByXPath("//table//tr/th");
			List<WebElement> values = driver.findElementsByXPath("(//table//tr)[2]/td");
			
			Map<String,String> wtValues = new HashMap<String,String>();
			for(int i=0;i<keys.size();i++) {
				wtValues.put(keys.get(i).getText(), values.get(i).getText());
			}
			
			if(wtValues.get("Vendor").equals("Blue Lagoon")) {
				System.out.println("Country for the vendor-Blue Lagoon :" + wtValues.get("Country"));
			}
			
			driver.findElementByXPath("//a[text()='Log Out']").click();
			
			driver.close();
			
			
			
	}

}
