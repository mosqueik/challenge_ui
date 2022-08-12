package webAutomation.support;

import io.github.bonigarcia.wdm.managers.ChromiumDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

@SuppressWarnings({"unchecked", "deprecation"})
public class ChromiumManager extends DriverManager {

	protected WebDriver driver;


	@Override
	protected WebDriver createDriver() {
		ChromiumDriverManager.chromiumdriver().setup();
		final ChromeOptions options = new ChromeOptions();
		options.setCapability("chrome.binary", ChromiumDriverManager.chromiumdriver().getDownloadedDriverPath());
		this.driver = new ChromeDriver(options);
		return this.driver;
	}

	@Override
	public WebDriver getDriver() {
		if (driver == null) {
			this.createDriver();
		}
		return driver;
	}

}