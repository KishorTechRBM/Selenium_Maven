package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Links {
	public class Agent_Login_Test {
		WebDriver driver = null;
		String url = "https://appwrk.com/";
		String projectPath = System.getProperty("user.dir");

		@Test (priority = 0)
		public void Launch_Browser() {
			System.setProperty("webdriver.edge.driver", projectPath + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
	
}
}
