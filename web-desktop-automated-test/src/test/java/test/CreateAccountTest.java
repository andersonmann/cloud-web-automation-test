/**
 * 
 */
package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.BaseTest;
import page.CreateAccountPage;
import rules.CreateAccountRules;
import util.MessagesAndLogs;

/**
 * @author andersonmann
 *
 */
public class CreateAccountTest extends BaseTest {
	CreateAccountRules account = new CreateAccountRules();
	CreateAccountPage accountPage = new CreateAccountPage();

	@DataProvider(name = "existingUserData")
	public static Object[][] login01() {
		return new Object[][] { { "mr.robot@robot.com" } };
	}

	@Test(priority = 0)
	public void createNewUser() {
		account.createNewAccountFlow();
		assertEquals(account.getHomeLogin(), MessagesAndLogs.homeLoginUrl);
		loging(MessagesAndLogs.creatingAccountSuccessMessage);
	}

	@Test(dataProvider = "existingUserData", priority = 1)
	public void existingUser(String email) {
		account.existingUser(email);
		assertEquals(account.getValue(By.id("error-message")), MessagesAndLogs.invalidRegistration);
		loging(MessagesAndLogs.invalidRegistration);
	}

}
