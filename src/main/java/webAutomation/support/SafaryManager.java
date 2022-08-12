package webAutomation.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafaryManager extends DriverManager{

    protected WebDriver driver;

    @Override
    protected WebDriver createDriver() {
        return driver = new SafariDriver();
    }

    @Override
    public WebDriver getDriver() {
        if (driver == null) {
            this.createDriver();
        }
        return driver;
    }
}
