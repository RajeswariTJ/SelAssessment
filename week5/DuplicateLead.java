package week5;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leataps.testng.base.ProjectSpecificMethod;

public class DuplicateLead extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setData() {
		excelFileName = "TC002";
	}
	
	@Test(dataProvider = "ArrayData")
	public void runTC002(String pno) throws InterruptedException {
		System.out.println("@Test Method Started");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(pno);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByName("submitButton").click();
		System.out.println("@Test Method Ended");
}
}






