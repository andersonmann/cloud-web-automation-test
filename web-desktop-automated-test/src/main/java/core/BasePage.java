package core;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import util.ExtentTestManager;

/**
 * @author andersonmann
 *
 */
public class BasePage extends BrowserFactory {
	protected ExtentTestManager log = new ExtentTestManager();
	private static final String ELEMENT_NOT_FOUND = "Element not found: ";

	/**
	 * This auxiliary method proved a smart wait for a element
	 * 
	 * @param By Type of locator used for search (Ex: id, name, xpath,cssSelector)
	 * @param by the locator identifier
	 */
	public void waitForElement(By by) {
		log.getTest().log(Status.INFO, "waiting presence of element: " + by);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	/**
	 * Find an element and click
	 * 
	 * @param By Type of locator used for search (Ex: id, name, xpath,cssSelector)
	 * @param by the locator identifier
	 * @throws NoSuchElementException
	 */
	public void click(By by) {
		try {
			log.getTest().log(Status.INFO, "clicking at the element: " + by);
			driver.findElement(by).click();
		} catch (Exception e) {
			throw new NoSuchElementException(ELEMENT_NOT_FOUND + e.getMessage());
		}
	}

	/**
	 * Find an element and perform writing in the field *
	 * 
	 * @param By     Type of locator used for search (Ex: id, name,
	 *               xpath,cssSelector)
	 * @param by     the locator identifier
	 * @param String Text to be written in the field
	 */
	public void write(By by, String text) {
		try {
			log.getTest().log(Status.INFO, "typing the text: " + text);
			WebElement element = driver.findElement(by);
			element.sendKeys(text);
		} catch (Exception e) {
			throw new NoSuchElementException(ELEMENT_NOT_FOUND + e.getMessage());
		}
	}

	/**
	 * Find an element and get the message
	 * 
	 * @param By  Type of locator used for search (Ex: id, name, xpath,cssSelector)
	 * @param the locator identifier
	 * @return the value of element
	 * @throws NoSuchElementException
	 */

	public String getValue(By by) {
		try {
			log.getTest().log(Status.INFO, "getting text of the locator: " + by);
			return driver.findElement(by).getText();
		} catch (Exception e) {
			throw new NoSuchElementException(ELEMENT_NOT_FOUND + e.getMessage());
		}
	}
}
