/**
 * 
 */
package page;

import core.BasePage;

/**
 * @author andersonmann
 *
 */
public class LoginPage extends BasePage {
	HomePage home = new HomePage();

	public void login(String email, String password) {
		home.insertEmail(email);
		home.insertPassword(password);
		home.clickLogin();
	}
}