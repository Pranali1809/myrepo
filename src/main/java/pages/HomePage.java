package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy (xpath="//div[@id='branding']//a[@id='welcome']")
	private WebElement welcomelink;
	
	@FindBy (xpath="//div[@id='welcome-menu']/ul/li[3]//a[text()='Logout']")
	private WebElement logoutLink;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLink() {
		
		return welcomelink;
	}
	
	public WebElement getLogoutLink() {
		
		return logoutLink;
	}
	
	

}
