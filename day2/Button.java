package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Click button to travel home page
		driver.findElementByXPath("//button[text()='Go to Home Page']").click();
		driver.findElementByXPath("//img[@alt='Buttons']").click();
		
		//Find position of button (x,y)
		System.out.println("\nFind position of button(x,y):");
		System.out.println(driver.findElementByXPath("//*[text()='Get Position']").getLocation());
		System.out.println(driver.findElementByXPath("//button[text()='Get Position']").getLocation().getX());
		System.out.println(driver.findElementByXPath("//button[text()='Get Position']").getLocation().getY());
				
		//Find button color
		System.out.println("\nFind Button color:");
		System.out.println(driver.findElementByXPath("//*[@id='color']").getCssValue("background-color"));
		
		//Find the width and height
		System.out.println("\nFind the height and width:");
		System.out.println(driver.findElementByXPath("//*[@id='size']").getSize());
		System.out.println(driver.findElementByXPath("//*[@id='size']").getSize().getWidth());
		System.out.println(driver.findElementByXPath("//*[@id='size']").getSize().getHeight());
		
				
		driver.close();
				
	}

}
