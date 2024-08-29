package MicroSite_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import MicroSite_Page_Objects.Login_Page;

public class Verifier_Login_Test {
	WebDriver driver = null;
	String url = "https://aigacd.aigcisandbox.com/Index.aspx";
	String projectPath = System.getProperty("user.dir");

	@Test (priority = 0)
	public void Launch_Browser() {
		System.setProperty("webdriver.edge.driver", projectPath + "/drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get(url);
	}
	
	@Test (priority = 1)
	public void Login() throws Exception {
		FileInputStream fis = new FileInputStream(projectPath+"/src/test/java/MicroSite_Data/Login_Data");
		Properties p = new Properties();
		p.load(fis);
		
		Login_Page lo = new Login_Page(driver);
		lo.UserName(p.getProperty("VerUserName"));
		lo.Password(p.getProperty("VerPassword"));
		lo.Login();
	}
}
