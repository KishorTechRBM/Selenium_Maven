package MicroSite_Page_Objects;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment_Page {
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	
	By CardName = By.id("ContentPlaceHolder1_txtNameOnCard");
	By CardType = By.id("ContentPlaceHolder1_rbCardType_1");
	By CardNumber = By.id("ContentPlaceHolder1_txtCreditCardNo");
	By CardExpM = By.id("ContentPlaceHolder1_txtCreditMonth");
	By CardExpY = By.id("ContentPlaceHolder1_txtCreditYear");
	By Submit = By.id("ContentPlaceHolder1_btnSubmit");
	
	public Payment_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Payment_Form() throws Exception {
		FileInputStream fis = new FileInputStream(projectPath + "/src/test/java/MicroSite_Data/Payment_Data");
		Properties p = new Properties();
		p.load(fis);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(CardName).sendKeys(p.getProperty("NameOnCard"));
		driver.findElement(CardType).click();
		driver.findElement(CardNumber).sendKeys(p.getProperty("CreditCardNumber"));
		driver.findElement(CardExpM).sendKeys(p.getProperty("CardExpM"));
		driver.findElement(CardExpY).sendKeys(p.getProperty("CardExpY"));
//		driver.findElement(Submit).click();
	}

}
