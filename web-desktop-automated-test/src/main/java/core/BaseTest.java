/**
 * 
 */
package core;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 * @author andersonmann
 *
 */
public class BaseTest extends BrowserFactory {

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "browser", "browser_version", "os", "os_version", "resolution", "project", "build" })
	public static void setupDriver(String browser, String browser_version, String os, String os_version,
			String resolution, String project, String build) {
		createDriver(browser, browser_version, os, os_version, resolution, project, build);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() throws UnsupportedEncodingException, URISyntaxException, IOException {
		if (driver != null) {
			driver.quit();
		}
	}

}
