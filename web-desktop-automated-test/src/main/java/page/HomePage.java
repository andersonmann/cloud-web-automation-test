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
	 * this method click on button log in
	 */
	public void clickLogin() {
		click(By.id("btn-signin"));
	}

	/**
	 * this method click on button create account
	 */
	public void clickCreateAccount() {
		click(By.id("btn-signup-switch"));
	}

	/**
	 * this method click on button recovery password
	 */
	public void clickForgetPassword() {
		click(By.id("btn-recovery-switch"));
	}

	/**
	 * this method type user's email
	 * 
	 * @param email
	 */
	public void insertEmail(String email) {
		write(By.id("email_signin"), email);
	}

	/**
	 * this method type user's password
	 * 
	 * @param password
	 */
	public void insertPassword(String password) {
		write(By.id("password_signin"), password);
	}
}
