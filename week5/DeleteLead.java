package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leataps.testng.base.ProjectSpecificMethod;

public class DeleteLead extends  ProjectSpecificMethod{
	
	@BeforeTest
	public void setData() {
		excelFileName = "TC002";
	}
	
	
	@Test(dataProvider = "ArrayData")
	public void runTC003(String pno) throws InterruptedException {
		System.out.println("@Test Method Started");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(pno);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElementByClassName("x-paging-info"), "No records to display"));
		String text = driver.findElementByClassName("x-paging-info").getText();
		System.out.println("text: "+text);
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		System.out.println("@Test Method Ended");
}
}






