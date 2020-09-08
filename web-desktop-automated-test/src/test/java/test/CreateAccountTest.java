/**
 * 
 */
package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.BaseTest;
import rules.CreateAccountRules;
import util.MessagesAndLogs;

/**
 * @author andersonmann
 *
 */
public class CreateAccountTest extends BaseTest {
	CreateAccountRules account = new CreateAccountRules();

	@DataProvider(name = "existingUserData")
	public static Object[][] login01() {
		return new Object[][] { { "mr.robot@robot.com" } };
	}

	@Test(priority = 0)
	public void requiredFields() {
		account.requiredFields();
		assertEquals(account.getValue(By.id("error-signup-name")), MessagesAndLogs.userNameErrorMessage);
		assertEquals(account.getValue(By.id("error-signup-email")), MessagesAndLogs.emailErrorMessage);
		assertEquals(account.getValue(By.id("error-signup-password")), MessagesAndLogs.passwordErrorMessage);
		loging(MessagesAndLogs.accountErrorLog);
	}

	@Test(dataProvider = "existingUserData", priority = 1)
	public void existingUser(String email) {
		account.existingUser(email);
		assertEquals(account.getValue(By.id("error-message")), MessagesAndLogs.registrationErrorMessage);
		loging(MessagesAndLogs.accountErrorLog);
	}

	@Test(priority = 2)
	public void createNewUser() {
		account.createNewAccountFlow();
		assertEquals(account.getHomeLogin(), MessagesAndLogs.homeLoginUrl);
		loging(MessagesAndLogs.creatingAccountSuccessMessage);
	}
}