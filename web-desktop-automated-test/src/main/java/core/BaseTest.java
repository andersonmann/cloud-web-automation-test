/**
 * 
 */
package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import util.ExtentTestManager;

/**
 * @author andersonmann
 *
 */
public class BaseTest extends DriverFactory {
	protected ExtentTestManager log = new ExtentTestManager();
//	protected LoginPage login = new LoginPage();

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

}
