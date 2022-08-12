package webAutomation.support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class FirefoxManager extends DriverManager {

	protected WebDriver driver;

	@Override
	protected WebDriver createDriver() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("start-maximized");
		return driver = new FirefoxDriver(options);
	}

	@Override
	public WebDriver getDriver() {
		if (driver == null) {
			this.createDriver();
		}
		return driver;
	}

}