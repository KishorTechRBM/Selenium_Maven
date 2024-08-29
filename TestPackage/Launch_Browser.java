package TestPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser {
		public static <WebElement> void main(String args[]) {
			System.out.println("Hello Java");
//			String projectpath = System.getProperty("user.dir");
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
			
//			WebDriverManager.iedriver().setup();
//			driver = new InternetExplorerDriver();
			
			driver.get("https://www.google.co.in/");	 
			 List<WebElement> links = (List<WebElement>) driver.findElements(By.linkText("a")); 
			 int linksCount = links.size();
			 System.out.println("Total no of links Available: "+linksCount);
			 
			 for (int i=0; i<=links.size();i++) {
				 WebElement element = links.get(i);
//				 String url = element.getAttribute("href");
				 
			 }

		}
}
