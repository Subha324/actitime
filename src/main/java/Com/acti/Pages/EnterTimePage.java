package Com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.acti.Base.DriverScript;

public class EnterTimePage extends DriverScript {
	public EnterTimePage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='lable']")
	WebElement TimeTracKLable;
	@FindBy(id = "logoutLink")
	WebElement LogoutBt;

}
