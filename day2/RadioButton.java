package week2.day2;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args)  {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		
		//Select Yes or No
		System.out.println("Are you enjoying the classes?");
		driver.findElementByXPath("//input[@id='yes']").click();
		if(driver.findElementByXPath("//*[@id='yes']").isSelected()) {
			System.out.println("Yes");
		}else if(driver.findElementByXPath("//*[@id='no']").isSelected()) {
				System.out.println("No");	
		}else{
		System.out.println("Nothing is selected");	
		}
		
		//Find default selected radio button		
		System.out.println("\nFind default selected radio button:");
		
		if(driver.findElementByXPath("//label[@for='Unchecked']/input").isSelected()) {
			System.out.println("Unchecked Radio button is selected by default");
		}else if(driver.findElementByXPath("//label[@for='Checked']/input").isSelected()) {
				System.out.println("Checked Radio button is selected by default");	
		}else{
		System.out.println("Nothing is selected");	
		}
		
		//Select your age group (Only if choice wasn't selected)
		System.out.println("\nSelect your age group (Only if choice wasn't selected)");
		if(driver.findElementByXPath("(//input[@name='age'])[2]").isSelected()) {
			System.out.println("Age group 21 - 40 years is selected by default");
		}else {
			driver.findElementByXPath("(//input[@name='age'])[2]").click();
		}
		driver.close();
	}
}	
