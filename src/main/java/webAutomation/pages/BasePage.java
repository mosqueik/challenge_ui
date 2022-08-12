package webAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import webAutomation.support.World;

/**
 * The type Base page.
 */
public abstract class BasePage {
	/**
	 * The World.
	 */
	protected World world;

	/**
	 * Instantiates a new Base page.
	 *
	 * @param world the world
	 */
// Initiate the Page Factory and create as abstract class, so
	// you can use for all the other Page Objects
	public BasePage(World world) {
		this.world = world;
		PageFactory.initElements(world.driver, this);
	}

	/**
	 * Navigate to url.
	 */
// It is possible to use the driver already instantiate in the World.class
	public void navigate() {
		world.driver.manage().deleteAllCookies();
		world.driver.get(world.support.baseUrl);
	}

	/**
	 * Verify title by url boolean.
	 *
	 * @param title the title
	 * @return the boolean
	 */
	public abstract boolean verifyTitle(String title);

	/**
	 * Click on noteworth logo.
	 */
	public void clickOnNoteworthLogo(){
		clickOnElement(world.wait.waitElementToBePresent(By.xpath("//img[@alt='Noteworth']")));
	}

	/**
	 * Click on element.
	 *
	 * @param element the element
	 */
	public void clickOnElement(WebElement element){
		world.wait.waitElement(element);
		element.click();
	}

	/**
	 * Type on element.
	 *
	 * @param element the element
	 * @param text    the text
	 */
	public void typeOnElement(WebElement element,String text){

		world.wait.waitElement(element);
		clickOnElement(element);
		//This fragment of code is work in progress due to flackyness in test cases during typing methods execution on IE.
		//this should fix incomplete string issue when typing into an input
		/*if(PropertyUtils.getProperty("common.browser") == "IE11"){
			setAttribute(element,"value", text);
		}*/
		element.sendKeys(text);
	}

	/**
	 * Clear and type on element.
	 *
	 * @param element the element
	 * @param text    the text
	 */
	public void clearAndTypeOnElement(WebElement element, String text){
		world.wait.waitElement(element);
		clickOnElement(element);
		element.clear();
		//This fragment of code is work in progress due to flackyness in test cases during typing methods execution on IE.
		//this should fix incomplete string issue when typing into an input
		/*if(PropertyUtils.getProperty("common.browser") == "IE11"){
			setAttribute(element,"value", text);
		}*/
		element.sendKeys(text);
	}

	/**
	 * Java script click.
	 *
	 * @param element the element
	 */
	public void javaScriptClick(WebElement element){
		JavascriptExecutor executor = (JavascriptExecutor)getDriver();
		executor.executeScript("arguments[0].click();", element );
	}

	/**
	 * Get driver web driver.
	 *
	 * @return the web driver
	 */
	public WebDriver getDriver(){
		return this.world.driver;
	}
}
