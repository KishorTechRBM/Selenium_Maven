package MicroSite_Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	WebDriver driver = null;
	By UserName = By.id("txtUN");
	By Password = By.id("txtPwd");
	By Login = By.id("btnLogin");
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	public void UserName(String username) {
		driver.findElement(UserName).sendKeys(username);
	}
	
	public void Password(String paswrd) {
		driver.findElement(Password).sendKeys(paswrd);
	}
	
	public void Login() {
		driver.findElement(Login).click();
	}

}
