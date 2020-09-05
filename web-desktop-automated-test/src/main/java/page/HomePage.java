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

	public void clickLogin() {
		click(By.id("btn-signin"));
	}

	public void clickCreateAccount() {
		click(By.id("btn-signup-switch"));
	}

	public void clickForgetPassword() {
		click(By.id("btn-recovery-switch"));
	}

	public void insertEmail(String email) {
		write(By.id("email_signin"), email);
	}

	public void insertPassword(String password) {
		write(By.id("password_signin"), password);
	}
}
