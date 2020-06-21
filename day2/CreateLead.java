package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		
	String cmpnyName = "TestLeafSelTJ";
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	
	driver.manage().window().maximize();
	
	driver.findElementById("username").sendKeys("Demosalesmanager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	
	driver.findElementByLinkText("Leads").click();  
	driver.findElementByLinkText("Create Lead").click(); 
	
 
	driver.findElementByXPath("(//input[@name ='companyName'] )[2]").sendKeys(cmpnyName); 
	driver.findElementByXPath("(//input[@name ='firstName'] )[3]").sendKeys("Rajeswari");
	driver.findElementByXPath("(//input[@name ='lastName'] )[3]").sendKeys("TJ"); 
	 
	WebElement sourceDD = driver.findElementById("createLeadForm_dataSourceId");
	Select dd1 = new Select(sourceDD);
	dd1.selectByValue("LEAD_EMPLOYEE");
	
	driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("5000000");
	
	WebElement industryDD = driver.findElementById("createLeadForm_industryEnumId");
	Select dd2 = new Select(industryDD);
	dd2.selectByValue("IND_SOFTWARE");
	
	WebElement ownershipDD = driver.findElementById("createLeadForm_ownershipEnumId");
	Select dd3= new Select(ownershipDD);
	dd3.selectByVisibleText("S-Corporation");
	
	driver.findElementById("createLeadForm_description").sendKeys("Selenium Automation Tester");
	
	WebElement mcDD = driver.findElementById("createLeadForm_marketingCampaignId");
	Select dd4=new Select(mcDD);
	dd4.selectByIndex(6);
	
	WebElement stateDD = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
	Select dd5=new Select(stateDD);
	dd5.selectByValue("TX");
	
	driver.findElementById("createLeadForm_primaryEmail").sendKeys("rajicse379@gmail.com");
	driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9442050391");
	
	driver.findElementByXPath("//input[@name ='submitButton']").click(); 
	driver.close();
	 
	}

}
