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
public class LoginTest extends BaseTest {
	LoginRules login = new LoginRules();

	@DataProvider(name = "requiredFields")
	public static Object[][] requiredFields() {
		return new Object[][] { { "", "" } };
	}

	@DataProvider(name = "invalidEmail1")
	public static Object[][] invalidEmail1() {
		return new Object[][] { { "dasdasdasdasd", "" } };
	}

	@DataProvider(name = "invalidEmail2")
	public static Object[][] invalidEmail2() {
		return new Object[][] { { "mr.robot@", "Zenvia@2020" } };
	}

	@DataProvider(name = "invalidEmail3")
	public static Object[][] invalidEmail3() {
		return new Object[][] { { "mr.robot@gmail", "Zenvia@2020" } };
	}

	@DataProvider(name = "invalidPassword")
	public static Object[][] invalidPassword() {
		return new Object[][] { { "mr.robot@robot.com", "abcde12345" } };
	}

	@DataProvider(name = "userAndPasswordValid")
	public static Object[][] userAndPasswordValid() {
		return new Object[][] { { "mr.robot@robots.com", "Zenvia@2020" } };
	}

	@Test(dataProvider = "requiredFields", priority = 0)
	public void requiredFields(String email, String password) {
		login.login(email, password);
		assertEquals(login.getValue(By.id("error-signin-email")), MessagesAndLogs.emailErrorMessage);
		assertEquals(login.getValue(By.id("error-signin-password")), MessagesAndLogs.emptyPasswordErrorMessage);
		loging(MessagesAndLogs.empytFields);
	}

	@Test(dataProvider = "invalidEmail1", priority = 1)
	public void invalidEmail1(String email, String password) {
		login.login(email, password);
		assertEquals(login.getValue(By.id("error-signin-email")), MessagesAndLogs.emailErrorMessage);
		loging(MessagesAndLogs.emailErrorMessage);
	}

	@Test(dataProvider = "invalidEmail2", priority = 2)
	public void invalidEmail2(String email, String password) {
		login.login(email, password);
		assertEquals(login.getValue(By.id("error-signin-email")), MessagesAndLogs.emailErrorMessage);
		loging(MessagesAndLogs.emailErrorMessage);
	}

	@Test(dataProvider = "invalidEmail3", priority = 3)
	public void invalidEmail3(String email, String password) {
		login.login(email, password);
		assertEquals(login.getValue(By.id("error-signin-email")), MessagesAndLogs.emailErrorMessage);
		loging(MessagesAndLogs.emailErrorMessage);
	}

	@Test(dataProvider = "invalidPassword", priority = 4)
	public void invalidPassword(String email, String password) {
		login.login(email, password);
		assertEquals(login.getValue(By.id("error-message")), MessagesAndLogs.loginErrorErrorMessage);
		loging(MessagesAndLogs.loginErrorErrorMessage);
	}

	@Test(dataProvider = "userAndPasswordValid", priority = 5)
	public void loginSuccessfully(String email, String password) {
		login.login(email, password);
		assertEquals(login.getValue(By.xpath("//span[contains(text(),'Início')]")), MessagesAndLogs.homeApp);
		loging(MessagesAndLogs.loginSuccess);
	}
}