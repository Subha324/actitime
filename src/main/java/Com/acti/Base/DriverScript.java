package Com.acti.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverScript {
	public static WebDriver driver;
	static Properties prop;

	public DriverScript() {
		try {
			prop = new Properties();
			File src = new File("./act.Configure/Config.properties");
			FileInputStream fic = new FileInputStream(src);
			prop.load(fic);

		} catch (Exception e) {
			System.out.println("Page not found:" + e.getMessage());
		}
	}

	@Test
	public static void intiBrowser() {
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./act.browsers/chromedriver_win32 (1)/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./act.browsers/geckodriver-v0.26.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();

		} else {
			System.out.println("No proper browser specified: + please chcek the properties file");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = prop.getProperty("qaurl");
		driver.get(url);

	}

}
