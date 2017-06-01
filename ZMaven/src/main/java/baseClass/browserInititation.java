package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class browserInititation {

	public WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void browserSelection() {
		String browser="chrome";
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\chrome plugin\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Firefox plugin\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.navigate().to("https://uat.agshealth.com/Signin.aspx");
	}

}
