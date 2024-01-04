package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;


public class LoginTest1 extends BaseClass {

	@Test
	public void LoginFailureTest() {

		LoginPage login=new LoginPage(driver);
		login.LoginFuction("jhaneha1897@gmail.com","Ssuman@97164");

	//	WebElement errorMsg = driver.findElement(By.className("error_msg"));
		//System.out.println("The error message is " + errorMsg.getText());

		//String actmsg=errorMsg.getText();
		//String expMsg="The email or password you have entered is invalid.";
		//Assert.assertEquals(actmsg, expMsg);
	}
	
	
	@Test
	public void LoginSuccessTest() {
		LoginPage login=new LoginPage(driver);
		login.LoginFuction("jhaneha1897@gmail.com","Ssuman@971648");	
	}
}
