package webAutomation.support;

import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;

// Scenario scoped it is used to show Guice
// what will be the shared classes/variables and instantiate them only in here
@ScenarioScoped
public class World {
	public WebDriver driver = new DriverFactory().getManager();
	public Support support = new Support();
	public Wait wait = new Wait(driver);

	public World(){
		System.out.println("WORLD");
	}

}
