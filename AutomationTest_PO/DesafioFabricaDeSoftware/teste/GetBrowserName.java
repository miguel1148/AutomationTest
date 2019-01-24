package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Contas;
import pages.SeuBarrigaLogin;

public class GetBrowserName {

	private WebDriver driver;
	private Capabilities caps;
	
	
	@Before
	public void initializer() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MiguelRamalho_Dev\\chromedriver.exe");
		driver = new ChromeDriver();
		caps = ((RemoteWebDriver)driver).getCapabilities();
		driver.get("https://www.youtube.com/watch?v=3YGIuDVXOtg&index=11&list=PLUY1lsOTtPeLPAkMpl8EFIDqWgv1QTXST");
		
		
	}
	
	@Test
	public void test() {
		String browserName = caps.getBrowserName();
		String browserVersion = caps.getVersion();
		
		System.out.println("Browser: " + browserName + "\n"
				+ "Version: " + browserVersion);
	}

}
