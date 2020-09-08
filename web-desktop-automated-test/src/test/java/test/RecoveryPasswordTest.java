/**
 * 
 */
package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.BaseTest;
import rules.LoginRules;
import util.MessagesAndLogs;

/**
 * @author andersonmann
 *
 */
public class RecoveryPasswordTest extends BaseTest {
	LoginRules login = new LoginRules();

	@DataProvider(name = "recoveryPassword")
	public static Object[][] recoveryPassword() {
		return new Object[][] { { "mr.robot@robots.com" } };
	}

	@DataProvider(name = "recoveryPasswordError1")
	public static Object[][] recoveryPasswordError1() {
		return new Object[][] { { "" } };
	}

	@DataProvider(name = "recoveryPasswordError2")
	public static Object[][] recoveryPasswordError2() {
		return new Object[][] { { "a@a" } };
	}

	@Test(dataProvider = "recoveryPassword", priority = 0)
	public void recoveryPassword(String email) {
		login.recoveryPassword(email);
		assertEquals(login.getValue(By.id("success-message")), MessagesAndLogs.passwordRecoverrySuccessMessage);
		loging(MessagesAndLogs.passwordRecoverrySuccessMessage);
	}

	@Test(dataProvider = "recoveryPasswordError1", priority = 1)
	public void recoveryPasswordError1(String email) {
		login.recoveryPassword(email);
		assertEquals(login.getValue(By.id("error-recovery-email")), MessagesAndLogs.emailErrorMessage);
		loging(MessagesAndLogs.emailErrorMessage);
	}

	@Test(dataProvider = "recoveryPasswordError2", priority = 2)
	public void recoveryPasswordError2(String email) {
		login.recoveryPassword(email);
		assertEquals(login.getValue(By.id("error-recovery-email")), MessagesAndLogs.emailErrorMessage);
		loging(MessagesAndLogs.emailErrorMessage);
	}
}