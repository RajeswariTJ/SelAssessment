package week5;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leataps.testng.base.ProjectSpecificMethod;

public class EditLead extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setData() {
		excelFileName = "TC003";
	}
		
	@Test(dataProvider="ArrayData")
	public void runTC004(String pno,String updateCName) throws InterruptedException {
		System.out.println("@Test Method Started");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(pno);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();	
		driver.findElementById("updateLeadForm_companyName").sendKeys(updateCName);
		driver.findElementByName("submitButton").click();
		System.out.println("@Test Method Ended");
}
}






