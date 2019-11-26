package Com.acti.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.acti.Base.DriverScript;
import Com.acti.Pages.LoginPage;

public class Tc001_Login extends DriverScript {

	LoginPage Ip;

	public Tc001_Login() {
		// Super keyword is used to call for base class constactor
		super();

	}

	@BeforeMethod
	public void precondition() {
		intiBrowser();
		Ip = new LoginPage();

	}

	@Test
	public void test() {

		String Title = Ip.VerifyTitle();
		System.out.println(Title);

	}

	@Test
	public void TestverifyLogoDisplayed() {
		Boolean Result = Ip.verifyLogoisDisplayed();
		System.out.println(Result);

	}

	@Test
	public void TestValidateLoginFunction() {
		Ip.ValidateLoginFunction("admin", "manager");
	}

	@AfterMethod
	public void postcondition() {
		driver.close();

	}
}