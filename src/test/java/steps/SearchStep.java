package steps;

import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import webAutomation.pages.HomePage;
import webAutomation.pages.SearchPage;
import webAutomation.support.World;

/**
 * The type Search step.
 */
public class SearchStep {

	// Here you need to inject the pages that you need to use
	// Then you don't need to create new instance 
	@Inject
	private World world;

	@Inject
	private HomePage homePage;

	@Inject
	private SearchPage searchPage;

	@Given("^I open the base url$")
	public void i_have_opened_the_browser() {
		homePage.navigate();
	}

	@When("I type the search string {string} and click on search button")
	public void i_type_pass_check_show_pass(String searchString){
		homePage.search(searchString);
	}

	@Then("I should see the searched page title containing {string}")
	public void i_should_hte_search_page_title(String searchString){
		Assert.assertTrue(searchPage.verifyTitle(searchString));
	}

	@Then("^I should see the \"([^\"]*)\" title of the page$")
	public void i_should_see_the_title_of_the_page(String title) {
		Assert.assertTrue("The title of the page should be:" + title, homePage.verifyTitle(title));
	}


}
