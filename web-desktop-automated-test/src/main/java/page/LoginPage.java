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
public class LoginPage extends BasePage {

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

	/**
	 * this method click on button log in
	 */
	public void clickButtonLogin() {
		click(By.id("btn-signin"));
	}

	/**
	 * This method type the email to recovery password
	 * 
	 * @param email
	 */
	public void inserEmailToRecoveryPassword(String email) {
		write(By.id("recovery-email"), email);
	}

	/**
	 * This method click at button recovery password
	 */
	public void clickButtonRecoveryPassword() {
		click(By.id("btn-send-recovery"));
	}
}