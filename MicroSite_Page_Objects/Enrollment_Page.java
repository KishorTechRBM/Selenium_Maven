package MicroSite_Page_Objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Enrollment_Page {
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

	By Submit = By.id("ContentPlaceHolder1_btnSubmit");
	By FirstName = By.id("ContentPlaceHolder1_txtFirstName");
	By LastName = By.id("ContentPlaceHolder1_txtLastName");
	By DOB = By.id("ContentPlaceHolder1_txtPrmryInsuredDOB");
	By CoverageType = By.id("ContentPlaceHolder1_rbCoverage_0");
	By Address1 = By.id("ContentPlaceHolder1_txtAddress1");
	By City = By.id("ContentPlaceHolder1_txtCity");
	By State = By.id("ContentPlaceHolder1_ddlState");
	By ZipCode = By.id("ContentPlaceHolder1_txtZip");
	By PhoneNumber = By.id("ContentPlaceHolder1_txtPhoneNumber");
	By Email = By.id("ContentPlaceHolder1_txtEmail");
	By CEmail = By.id("ContentPlaceHolder1_txtConfirmEmail");
	By Marketingopt = By.id("ContentPlaceHolder1_rbMarketOpt_0");
	By PaymentFrequency = By.id("ContentPlaceHolder1_rbPaymentFreq_0");
	By SelectPlan = By.id("ContentPlaceHolder1_rbPlan_0");
	By FulfillmentPreference = By.id("ContentPlaceHolder1_rbFulfillment_0");
	By SelectPaymentMethod = By.id("ContentPlaceHolder1_rbPaymentType_0");
	By TC = By.id("ContentPlaceHolder1_chkTerms");
	By Next = By.id("ContentPlaceHolder1_btnNext");

	public Enrollment_Page(WebDriver driver) {
		this.driver = driver;
	}

	public void Enrollment_Form() throws Exception {
		FileInputStream fis = new FileInputStream(projectPath + "/src/test/java/MicroSite_Data/Enrollment_Data");
		Properties p = new Properties();
		p.load(fis);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select Product = new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlCampaign")));
		Product.selectByVisibleText(p.getProperty("SelectProduct"));

		Select Partner = new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlPartnerList")));
		Partner.selectByVisibleText(p.getProperty("SelectPartner"));
		driver.findElement(Submit).click();

		driver.findElement(FirstName).sendKeys(p.getProperty("FirstName"));
		driver.findElement(LastName).sendKeys(p.getProperty("LastName"));
		
		Thread.sleep(10000);
//		driver.findElement(DOB).sendKeys(p.getProperty("DOB"));
		driver.findElement(CoverageType).click();
		driver.findElement(Address1).sendKeys(p.getProperty("Address1"));
		driver.findElement(City).sendKeys(p.getProperty("City"));
		driver.findElement(State).sendKeys(p.getProperty("State"));
		
		Thread.sleep(2000);
		driver.findElement(ZipCode).sendKeys(p.getProperty("ZipCode"));
		driver.findElement(PhoneNumber).sendKeys(p.getProperty("PhoneNumber"));
		driver.findElement(Email).sendKeys(p.getProperty("EmailAddress"));
		driver.findElement(CEmail).sendKeys(p.getProperty("ConfirmEmailAddress"));
		driver.findElement(Marketingopt).click();
		driver.findElement(PaymentFrequency).click();
		
		Thread.sleep(10000);
		driver.findElement(SelectPlan).click();
		driver.findElement(FulfillmentPreference).click();
		driver.findElement(SelectPaymentMethod).click();
		driver.findElement(TC).click();
		driver.findElement(Next).click();
	}

}
