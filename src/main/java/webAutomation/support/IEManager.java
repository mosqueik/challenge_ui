package webAutomation.support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;


public class IEManager extends DriverManager {

	protected WebDriver driver;

	@Override
	protected WebDriver createDriver() {
		WebDriverManager.iedriver().setup();
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.setCapability("requireWindowFocus", true);
		options.setCapability("unexpectedAlertBehaviour", "dismiss");
		options.setCapability("ignoreProtectedModeSettings", false);
		options.setCapability("ignoreZoomSetting", false);
		options.setCapability("nativeEvents", true);
		options.setCapability("handlesAlerts", true);
		options.setCapability("javascriptEnabled", true);
		options.setCapability("enableElementCacheCleanup", true);
		options.setCapability("cssSelectorsEnabled", true);
		options.setCapability("usePerProcessProxy", false);
		options.setCapability("elementScrollBehavior", 0);
		options.setCapability("enablePersistentHover", false);
		options.setCapability("pageLoadStrategy", "normal");
		options.setCapability("ensureCleanSession", true);
		options.setCapability("forceCreateProcessApi", true);
		options.setCapability("browserCommandLineSwitches", "-private");
		options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		return driver = new InternetExplorerDriver(options);

	}

	@Override
	public WebDriver getDriver() {
		if (driver == null) {
			this.createDriver();
		}
		return driver;
	}

}