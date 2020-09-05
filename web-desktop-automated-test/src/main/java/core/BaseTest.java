/**
 * 
 */
package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.Status;

import util.ExtentTestManager;

/**
 * @author andersonmann
 *
 */
public class BaseTest extends BrowserFactory {
	protected ExtentTestManager log = new ExtentTestManager();
	private static String validatingMessage = "Validating messages";

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "browser", "browser_version", "os", "os_version", "resolution", "project", "build" })
	public static void setupDriver(String browser, String browser_version, String os, String os_version,
			String resolution, String project, String build) {
		createDriver(browser, browser_version, os, os_version, resolution, project, build);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	public void loging(String message) {
		log.getTest().log(Status.INFO, validatingMessage);
		log.getTest().log(Status.INFO, message);
	}
}