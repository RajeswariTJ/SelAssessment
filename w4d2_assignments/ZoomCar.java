package week4.w4d2_assignments;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {
	
	static String price=null;
	static int intPrice;
	static String replace = null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByClassName("search").click();
		driver.findElementByXPath("(//div[text()='Popular Pick-up points']/following-sibling::div)[1]").click();
		driver.findElementByTagName("button").click();
		
		Date date = new Date(); // Get the current date
		DateFormat sdf = new SimpleDateFormat("dd"); //Get only the date (and not month, year, time etc)
		String today = sdf.format(date); // Get today's date
		int tomorrow = Integer.parseInt(today)+1; // Convert to integer and add 1 to it
		System.out.println(tomorrow);
		String tmrwDate = String.valueOf(tomorrow);
		
		List<WebElement> getDates = driver.findElementsByXPath("//div[@class='day low-price']");
		for(WebElement eachDate : getDates) {
			System.out.println(eachDate.getText());
			if((eachDate.getText().trim()).contains(tmrwDate)) {
				eachDate.click();
				break;
			}
		}
		
		driver.findElementByTagName("button").click();
		driver.findElementByTagName("button").click();
		
		List<WebElement> carList = driver.findElementsByXPath("//div[@class='car-listing']");
		System.out.println("No of cars listed: "+carList.size());
		
		
		List<WebElement> carName =  driver.findElementsByTagName("h3");
		List<WebElement> carPrice = driver.findElementsByXPath("//div[@class='price']");
				
		List<Integer> carIntPrice = new ArrayList<Integer>();
		for(WebElement eachCarPrice : carPrice) {	
			replace=(eachCarPrice.getText().substring(2)).replace(",", "");
			intPrice = Integer.parseInt(replace);
			carIntPrice.add(intPrice);
		}
		
		Map<Integer,String> carNameAdPrice = new HashMap<Integer,String>(); 
		for(int i = 0;i<carName.size();i++) {
			carNameAdPrice.put(carIntPrice.get(i), carName.get(i).getText());
		}
		
		Integer max = Collections.max(carNameAdPrice.keySet());
		//System.out.println(max);
		System.out.println("highest priced car ride- "+carNameAdPrice.get(max)+"@Rs."+max);
		
		
		driver.findElementByXPath("//div[@class='details']/h3[text()='"+carNameAdPrice.get(max)+"']/parent::div/following-sibling::div/div/div[2]/following-sibling::button").click();
		
		
		driver.close();
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
