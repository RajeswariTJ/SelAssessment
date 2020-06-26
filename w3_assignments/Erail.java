package week3.w3_assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
	public static void main(String[] args) throws InterruptedException { 
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		driver.findElementById("chkSelectDateOnly").click();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("Kumbakonam",Keys.ENTER);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("Chennai Egmore",Keys.ENTER);
		Thread.sleep(5000);
		
		//Store all train names in the list
		Set<String> set = new HashSet<String>();
		List<WebElement> trainNames = driver.findElementsByXPath("//td[@style=';']/a");
		
		// get the size of List
		int listSize = trainNames.size();
		System.out.println("\nSize of list : "+listSize);
		
		//Retrieve all values from List and add list into a new set
		System.out.println("\nTrain names in LIST:");
				
		for(int i = 0; i<trainNames.size();i++) {
			//String trainName = trainNames.get(i).getAttribute("title");
			String trainName = trainNames.get(i).getText();
			System.out.println(trainName);
			set.add(trainName);
		}
				
		//get the size of list
		int setSize = set.size();
		System.out.println("\nSize of set: "+setSize);
		
		//compare the size of list and set to verify the names are unique
		if(listSize == setSize) {
			System.out.println("\nTrainNames are same");
		}else
		{
			System.out.println("\nTrainNames are unique");
		}
		
		
		//Retrieve all values from the set
		System.out.println("\nTrain names in SET:");
		List<String> list2 = new ArrayList<String>(set);
		for(int i = 0; i<list2.size();i++) {
			//String trainName = trainNames.get(i).getAttribute("title");
			String trainNameInSet = list2.get(i);
			System.out.println(trainNameInSet);
		}
		
	}
}
