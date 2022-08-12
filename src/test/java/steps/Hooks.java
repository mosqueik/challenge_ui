package steps;

import com.google.inject.Inject;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import webAutomation.support.World;

public class Hooks {
	@Inject
	private World world;

	// Set the value of the properties in the support
	@Before
	public void beforeScenario() {
		world.support.getProperties();
	}

	@After
	public void tearDown(){
		world.driver.quit();
	}

}
