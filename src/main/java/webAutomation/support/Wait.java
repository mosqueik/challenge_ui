package webAutomation.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/**
 * The type Wait.
 */
public class Wait {
	
	private WebDriver driver;

	/**
	 * Instantiates a new Wait.
	 *
	 * @param driver the driver
	 */
	public Wait(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Variables for time in seconds. Each was set in all methods below
	 * The following was added to each method name (except default one already used in tests)
	 * -> 'St' for shortTime , 'M' for mediumTime, 'L' for longTime
	 */
	int shortTime = 10;
	int mediumTime = 15;
	Duration longTime = Duration.ofSeconds(35);

	/**
	 * Wait element.
	 *
	 * @param element the element
	 */
	public void waitElement(WebElement element) {
		new WebDriverWait(driver, longTime).until(ExpectedConditions.elementToBeClickable(element));
	}


	/**
	 * Wait element to be present web element.
	 *
	 * @param locator the locator
	 * @return the web element
	 */
	public WebElement waitElementToBePresent(By locator){
		return new WebDriverWait(driver, longTime).until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * Wait element to be visible.
	 *
	 * @param element the element
	 * @return the web element
	 */
	public WebElement waitElementToBeVisible(WebElement element){
		return new WebDriverWait(driver, longTime).until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Wait text to be present in element boolean.
	 *
	 * @param element the element
	 * @param text    the text
	 * @return the boolean
	 */
	public boolean waitTextToBePresentInElement(WebElement element,String text){
		return new WebDriverWait(driver, longTime).until(ExpectedConditions.textToBePresentInElement(element,text));
	}

	/**
	 * Wait until attribute contains boolean.
	 *
	 * @param element   the element
	 * @param attribute the attribute
	 * @param value     the value
	 * @return the boolean
	 */
	public boolean waitUntilAttributeContains(WebElement element, String attribute, String value){

		return new WebDriverWait(driver, longTime).until(ExpectedConditions.attributeContains(element, attribute, value));
	}

	/**
	 * Wait url to contains a string.
	 *
	 * @param url the url fragment
	 * @return the boolean
	 */
	public boolean waitUrlToContains(String url){
		return new WebDriverWait(driver, longTime).until(ExpectedConditions.urlContains(url));
	}

	/**
	 * Element exist.
	 *
	 * @param by the by
	 * @return the boolean
	 */
	public boolean elementExist(By by){
		List<WebElement> elements = driver.findElements(by);
		return (elements.size() > 0);
	}


}
