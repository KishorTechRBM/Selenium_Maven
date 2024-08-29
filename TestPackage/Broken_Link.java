package TestPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Link {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

        try {
            // Navigate to the web page
        	driver.get("https://google.com"); // Replace with the actual URL

            // Get all links on the page
            List<WebElement> links = driver.findElements(By.tagName("a"));

            // Check each link
            for (WebElement link : links) {
                String url = link.getAttribute("href");
                if (url != null && !url.isEmpty()) {
                    checkLink(url);
                }
            }
        } finally {
            // Quit the WebDriver instance
            driver.quit();
        }
    }

    // Method to check if a link is broken
    public static void checkLink(String url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode >= 400) {
                System.out.println(url + " is a broken link. Response Code: " + responseCode);
            } else {
                System.out.println(url + " is a valid link. Response Code: " + responseCode);
            }
        } catch (IOException e) {
            System.out.println(url + " is a broken link. Exception: " + e.getMessage());
        }
    }

}
