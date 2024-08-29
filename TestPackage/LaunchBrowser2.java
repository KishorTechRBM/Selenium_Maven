package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser2 {
	public static void main(String args[]) {
		WebDriver driver = null;
		String url = "https://www.google.com/";
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
/*		
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Test successfully run on chrome");
		
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Test successfully run on firefox");
*/		
		System.setProperty("webdriver.edge.driver", projectPath + "/drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		System.out.println("Test successfully run on MS_Edge");
		
	}

}
