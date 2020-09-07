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
public class CreateAccount extends BasePage {

	/**
	 * this method type the name of user
	 * 
	 * @param name
	 */
	public void insertName(String name) {
		write(By.id("name_s"), name);
	}

	/**
	 * this method type the email of user
	 * 
	 * @param email
	 */
	public void insertEmail(String email) {
		write(By.id("email_s"), email);
	}

	/**
	 * this method type the password of user
	 * 
	 * @param password
	 */
	public void insertPassword(String password) {
		write(By.id("password_s"), password);
	}

	/**
	 * this method click on button create account
	 */
	public void clickCreate() {
		click(By.id("btn-btn-signup"));
	}
}