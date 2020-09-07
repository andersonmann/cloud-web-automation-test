/**
 * 
 */
package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.BaseTest;
import page.HomePage;
import rules.CreateAccountRules;

/**
 * @author andersonmann
 *
 */
public class CreateAccountTest extends BaseTest {
	CreateAccountRules account = new CreateAccountRules();
	HomePage home = new HomePage();
	private static String invalidRegistration = "Invalid registration, check if the email you entered is already registered.";

	@DataProvider(name = "existingUserData")
	public static Object[][] login01() {
		return new Object[][] { { "anderson.civil@hotmail.com" } };
	}

//	@Test(priority = 0)
//	public void createNewUser() {
//		account.createNewAccountFlow();
//	loging(empytFields);
//	}

	@Test(dataProvider = "existingUserData", priority = 1)
	public void existingUser(String email) {
		account.existingUser(email);
		assertEquals(account.getValue(By.id("error-message")), invalidRegistration);
		loging(invalidRegistration);
	}

}
