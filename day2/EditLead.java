package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		
		String cmpnyName = "TestLeafSelTJ";
		String newName = "TestLeafSelRTJ";
		
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
	
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(cmpnyName);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		//driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-companyName']/a").click();
		//driver.findElementByXPath("//a[text()='TestLeafSelTJ']").click();
		//driver.findElementByXPath("//a[contains(text(),'TestLeafSelTJ')]");
      driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByXPath("//a[text()='Edit']").click();
		
		String getCmpnyName = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").getAttribute("value");
		System.out.println("Company Name: "+ getCmpnyName);
		
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();		
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys(newName);
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
		
		String updatedName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("Updated Name: "+ updatedName);
		if(updatedName.contains(newName)) {
			System.out.println("Company name is verified successfully");
		}else {
			System.out.println("Company name verification fails");
		}
		driver.close();
		
		
		
	}
}
