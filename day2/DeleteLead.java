package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
	
	public static void main(String[] args) throws InterruptedException {
					
							
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			
			driver.manage().window().maximize();
			
			driver.findElementById("username").sendKeys("Demosalesmanager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			
			driver.findElementByLinkText("CRM/SFA").click();
			
			driver.findElementByLinkText("Leads").click(); 
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			
			driver.findElementByXPath("//span[text()='Email']").click();
			driver.findElementByXPath("(//input[@name='emailAddress'])[1]").sendKeys("rajicse379@gmail.com");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(5000);
			
			 String leadId = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
			
			System.out.println("leadId: "+leadId);
			
			driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
			driver.findElementByXPath("//a[text()='Delete']").click();
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			driver.findElementByXPath("//input[@name='id']").sendKeys(leadId);
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(5000);
					
			String noRecFound = driver.findElementByXPath("//div[text()='No records to display']").getText();
			System.out.println("Message:"+noRecFound);
			
			if(noRecFound.contains("No records to display")) {
				System.out.println("Message 'No records to display' is verified successfully.");
			}else {
				System.out.println("Message 'No records to display' verification fails.");
			}
	}
	
	
}
