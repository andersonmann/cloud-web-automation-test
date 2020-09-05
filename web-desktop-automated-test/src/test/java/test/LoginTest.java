/**
 * 
 */
package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.BaseTest;
import page.LoginPage;

/**
 * @author andersonmann
 *
 */
public class LoginTest extends BaseTest {
	LoginPage login = new LoginPage();
	private static String invalidEmail = "Invalid email address";
	private static String emptyPassword = "Insert your password";
	private static String loginError = "Wrong email or password.";
	private static String empytFields = "unauthorized access";
	private static String loginSuccess = "login successfully";

	@DataProvider(name = "requiredFields")
	public static Object[][] login0() {
		return new Object[][] { { "", "" } };
	}

	@DataProvider(name = "invalidEmail")
	public static Object[][] login1() {
		return new Object[][] { { "dasdasdasdasd", "" } };
	}

	@DataProvider(name = "invalidPassword")
	public static Object[][] login2() {
		return new Object[][] { { "anderson.civil@hotmail.com", "abcde12345" } };
	}

	@DataProvider(name = "userAndPasswordValid")
	public static Object[][] login03() {
		return new Object[][] { { "anderson.civil@hotmail.com", "Zenvia@2020" } };
	}

	@Test(dataProvider = "requiredFields", priority = 0)
	public void requiredFields(String email, String password) {
		login.login(email, password);
		assertEquals(login.getValue(By.id("error-signin-email")), invalidEmail);
		assertEquals(login.getValue(By.id("error-signin-password")), emptyPassword);
		loging(empytFields);
	}

	@Test(dataProvider = "invalidEmail", priority = 1)
	public void invalidEmail(String email, String password) {
		login.login(email, password);
		assertEquals(login.getValue(By.id("error-signin-email")), invalidEmail);
		loging(invalidEmail);
	}

	@Test(dataProvider = "invalidPassword", priority = 2)
	public void invalidPassword(String email, String password) {
		login.login(email, password);
		assertEquals(login.getValue(By.id("error-message")), loginError);
		loging(loginError);
	}

	@Test(dataProvider = "userAndPasswordValid", priority = 3)
	public void loginSuccessfully(String email, String password) {
		login.login(email, password);
		assertEquals(login.getValue(By.xpath("//span[contains(text(),'Início')]")), "Início");
		loging(loginSuccess);
	}
}
