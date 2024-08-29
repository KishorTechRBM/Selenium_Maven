package MicroSite_Page_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifier_Page {
	WebDriver driver = null;
	By Search = By.id("ContentPlaceHolder1_btnSearch");
	By Link = By.id("ContentPlaceHolder1_gvVerifier_lnkVerify_0");
	By Next = By.id("ContentPlaceHolder1_btnNext");
	By Approve = By.id("ContentPlaceHolder1_btnApprove");
	
	public Verifier_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Select(String campn) {
		Select Campaign = new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlCampaign")));
		Campaign.selectByVisibleText(campn);
		
	}
	
	public void Search() {
		driver.findElement(Search).click();
	}
	
	public void Link() {
		driver.findElement(Link).click();
	}
	
	public void Next() {
		driver.findElement(Next).click();
	}
	
	public void Approve() {
		driver.findElement(Approve).click();
	}
}
