package webAutomation.support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import webAutomation.utils.PropertyUtils;

public class ChromeManager extends DriverManager {

	protected ChromeDriver driver;

	//If Windows gets the .exe chromedriver
	@Override
	protected WebDriver createDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments(PropertyUtils.getProperty("common.chromeOptions.language"));
		return this.driver= new ChromeDriver(options);
	}

	@Override
	public WebDriver getDriver() {
		if (driver == null) {
			this.createDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

}