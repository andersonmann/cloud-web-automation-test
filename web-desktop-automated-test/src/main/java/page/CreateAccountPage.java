/**
 * 
 */
package page;

import org.openqa.selenium.By;

import core.BasePage;
import util.DataGenerator;

/**
 * @author andersonmann
 *
 */
public class CreateAccountPage extends BasePage {
	DataGenerator data = new DataGenerator();

	/**
	 * this method type user's name
	 * 
	 * @param name
	 */
	public void insertName() {
		write(By.id("name_s"), data.createUserName());
	}

	/**
	 * this method type user's email
	 * 
	 * @param email
	 */
	public void insertEmail() {
		write(By.id("email_s"), data.createEmailAddress());
	}

	/**
	 * this method type user's password
	 * 
	 * @param password
	 */
	public void insertPassword(String password) {
		write(By.id("password_s"), password);
	}

	/**
	 * this method click on button create account
	 */
	public void clickCreateAccount() {
		click(By.id("btn-signup"));
	}
}