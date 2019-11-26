package Com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.acti.Base.DriverScript;
// Object Indendification*****************

public class LoginPage extends DriverScript {
	@FindBy(id = "username")
	WebElement usernameTb;
	@FindBy(id = "loginButton")
	WebElement loginBn;
	@FindBy(name = "pwd")
	WebElement passwordTb;
	@FindBy(xpath = "//div[@class='atLogoImg']")
	WebElement actilogo;
	@FindBy(id = "toPasswordRecoveryPageLink")
	WebElement forgotpasswordlink;

	// Page/Object Initialization***************

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Action/methods***************************************************************************

	public String VerifyTitle() {
		return driver.getTitle();

	}

	public void ValidateLoginFunction(String Username, String Password) {
		usernameTb.sendKeys(Username);
		passwordTb.sendKeys(Password);
		loginBn.click();
	}

	public Boolean verifyLogoisDisplayed() {
		return actilogo.isDisplayed();

	}
}
