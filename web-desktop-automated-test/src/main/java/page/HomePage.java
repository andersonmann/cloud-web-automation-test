/**
 * 
 */
package page;

import org.openqa.selenium.By;

import core.BasePage;

/**
 * @author andersonmann
 *
 */
public class HomePage extends BasePage {

	/**
	 * this method click on button create account
	 */
	public void clickCreateAccount() {
		click(By.id("btn-signup-switch"));
	}

	/**
	 * this method click on button recovery password
	 */
	public void clickButtonForgetPassword() {
		click(By.id("btn-recovery-switch"));
	}
}