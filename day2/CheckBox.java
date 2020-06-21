package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/checkbox.html");
	driver.manage().window().maximize();
	
	//Select the languages that you know?
	List<WebElement> els = driver.findElements(By.xpath("//*[@id='contentblock']/section/div[1]/div/input"));
	
	int i = 1;
	for ( WebElement el : els) {
		if ( !el.isSelected() && i <4) {
	        el.click();
	     i++;
	    }
	}
	
	//Confirm Selenium is checked
	System.out.println("Confirm Selenium is checked or not?");
	
	if(driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input[1]").isSelected()) {
		System.out.println("Selenium checkBox is selected");
	}else {
		System.out.println("Selenium checkBox is not selected");
	}
	
	//DeSelect only checked
	List<WebElement> deselect = driver.findElementsByXPath("//*[@id='contentblock']/section/div[3]/div/input");
		
	for ( WebElement el : deselect ) {
		if ( el.isSelected() ) {
	        el.click();
	    }
	}
	
	
	//Select all options
	List<WebElement> selectAll = driver.findElementsByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/input");
	
	for ( WebElement el : selectAll ) {
		if ( !el.isSelected() ) {
	        el.click();
	    }
	}
		
	driver.close();
	}

}
