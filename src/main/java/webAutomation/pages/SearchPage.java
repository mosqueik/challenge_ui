package webAutomation.pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webAutomation.support.World;


/**
 * The type Search page.
 */
public class SearchPage extends BasePage {

	@Inject
	public SearchPage(World world) {
		super(world);
	}

	/**
	 * The Search input.
	 */
	@FindBy(css =  "title")
	WebElement title;

	/**
	 * The Search input.
	 */
	@FindBy(id = "firstHeading")
	WebElement searchPageTitle;

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
	public boolean verifySearchPageTitle(String title) {
		return searchPageTitle.getText().contains(title);
	}


}
