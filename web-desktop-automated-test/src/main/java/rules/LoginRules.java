/**
 * 
 */
package rules;

import core.BasePage;
import page.HomePage;
import page.LoginPage;

/**
 * @author andersonmann
 *
 */
public class LoginRules extends BasePage {
	LoginPage login = new LoginPage();
	HomePage home = new HomePage();

	/**
	 * this method do it the login
	 * 
	 * @param email
	 * @param password
	 */
	public void login(String email, String password) {
		login.insertEmail(email);
		login.insertPassword(password);
		login.clickButtonLogin();
	}

	/**
	 * This method recover user password
	 * 
	 * @param email
	 */
	public void recoveryPassword(String email) {
		home.clickButtonForgetPassword();
		login.inserEmailToRecoveryPassword(email);
		login.clickButtonRecoveryPassword();
	}
}