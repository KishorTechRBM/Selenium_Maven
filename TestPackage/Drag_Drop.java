package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://example.com");
        
        // Open the webpage
        driver.get("https://example.com/drag-and-drop");
        
        // Locate the source and target elements
        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));
        
        // Create an instance of Actions class
        Actions actions = new Actions(driver);
        
        // Perform drag and drop
        actions.dragAndDrop(sourceElement, targetElement).perform();

}
}