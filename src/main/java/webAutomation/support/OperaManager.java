package webAutomation.support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class OperaManager extends DriverManager {

	protected WebDriver driver;


	@Override
	protected WebDriver createDriver() {
		 WebDriverManager.operadriver().setup();
		 this.driver = new OperaManager().createDriver();
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