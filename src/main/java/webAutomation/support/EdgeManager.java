package webAutomation.support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeManager extends DriverManager {

	protected WebDriver driver;


	@Override
	protected WebDriver createDriver() {
		 WebDriverManager.edgedriver().setup();
		 return this.driver = new EdgeDriver();
	}

	@Override
	public WebDriver getDriver() {
		if (driver == null) {
			this.createDriver();
		}
		return driver;
	}

}