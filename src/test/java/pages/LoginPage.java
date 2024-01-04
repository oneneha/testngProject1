package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	//===============================Locators=================================================
	
	@FindBy(linkText="Log in")
	WebElement loginLink;
	
	@FindBy(name="user_login")
	WebElement Username;
	
	@FindBy(name="user_pwd")
	WebElement Password;
	
	@FindBy(name="rememberMe")
	WebElement Rememberme;
	
	@FindBy(name="btn_login")
	WebElement LoginBtn;
	
	
	//===============================Functions===============================================================================
	
	
	public LoginPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void LoginFuction(String UserNameVal,String PwdVal) {

		loginLink.click();
		Username.sendKeys("jhaneha1897@gmail.com");
		Password.sendKeys("Ssuman@971648");
		Rememberme.click();
		LoginBtn.click();

	}

}
