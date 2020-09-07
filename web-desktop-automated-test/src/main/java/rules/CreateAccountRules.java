/**
 * 
 */
package rules;

import org.openqa.selenium.By;

import core.BasePage;
import page.CreateAccountPage;
import page.HomePage;

/**
 * @author andersonmann
 *
 */
public class CreateAccountRules extends BasePage {
	HomePage home = new HomePage();
	CreateAccountPage account = new CreateAccountPage();

	/**
	 * This method fill the fields of account creation
	 * 
	 * @param name
	 * @param email
	 * @param password
	 */
	public void createNewAccount() {
		account.insertName();
		account.insertEmail();
		account.insertPassword("Zenvia@2020");
		account.clickCreateAccount();
	}

	/**
	 * This method starts the account creation flow
	 */
	public void createNewAccountFlow() {
		home.clickCreateAccount();
		createNewAccount();
	}

	public void existingUser(String email) {
		home.clickCreateAccount();
		account.insertName();
		write(By.id("email_s"), email);
		account.insertPassword("Zenvia@2020");
		account.clickCreateAccount();
	}

	/**
	 * This method wait loading page and return the current URL
	 * 
	 * @return
	 */
	public String getHomeLogin() {
		return account.getWelcome();
	}
}
