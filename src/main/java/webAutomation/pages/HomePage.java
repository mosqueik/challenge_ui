package webAutomation.pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webAutomation.support.World;


/**
 * The type Search page.
 */
public class HomePage extends BasePage {

	@Inject
	public HomePage(World world) {
		super(world);
	}

	/**
	 * The Search input.
	 */

	/**
	 * The Search input.
	 */
	@FindBy(id = "searchInput")
	WebElement search;

	/**
	 * The magnifying glass input.
	 */
	@FindBy(css =  "button[type='submit']")
	WebElement searchButton;

	
	
	@Override
	public boolean verifyTitle(String title) {
		return this.getDriver().getTitle().contains(title);
	}

	/**
	 * Login.
	 *
	 * @param word the search string
	 */
	public void search(String searchString) {
		this.typeSearch(searchString);
		searchButton.click();

	}

	/**
	 * Type the search.
	 *
	 * @param searchString
	 */
	public void typeSearch(String searchString){
		world.wait.waitElement(search);
		search.clear();
		search.sendKeys(searchString);
	}


}
