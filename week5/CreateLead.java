package week5;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leataps.testng.base.ProjectSpecificMethod;

public class CreateLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		excelFileName = "TC001";
	}
	
	@Test(dataProvider = "ArrayData")
	public void runTC001(String cName, String fName, String lName,String Pno) {
		System.out.println("@Test Method Started");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(Pno);
		driver.findElementByName("submitButton").click();
		System.out.println("@Test Method Ended");
}
}






