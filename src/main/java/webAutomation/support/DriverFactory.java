package webAutomation.support;

import org.openqa.selenium.WebDriver;
import webAutomation.utils.Utils;

// Need to implement the other browsers and create a switch
public class DriverFactory {
	public WebDriver getManager() {

		String browser = Utils.browser;

		switch (browser) {
			default:
			case Utils.CHROME_BROWSER:
				return new ChromeManager().getDriver();
			case Utils.FIREFOX_BROWSER:
				return new FirefoxManager().getDriver();
			case Utils.IE11_BROWSER:
				return new IEManager().getDriver();
			case Utils.EDGE_BROWSER:
				return new EdgeManager().getDriver();
			case Utils.OPERA_BROWSER:
				return new OperaManager().getDriver();
		}
	}
}
