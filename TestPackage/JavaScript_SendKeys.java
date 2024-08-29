package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_SendKeys {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://example.com");
		
		WebElement inputElement = driver.findElement(By.id("inputFieldId"));

        // Use JavaScript to set the value
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='your_value';", inputElement);
		
	}

}
