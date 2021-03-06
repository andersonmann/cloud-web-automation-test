/**
 * 
 */
package core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author andersonmann
 *
 */
public class BrowserFactory {
	protected static WebDriver driver;
	private static String url = "http://app.zenvia.com";

	/**
	 * @param browser
	 * @param browser_version
	 * @param os
	 * @param os_version
	 * @param resolution
	 * @param project
	 * @param build
	 */
	protected static void createDriver(String browser, String browser_version, String os, String os_version,
			String resolution, String project, String build) {
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("browser", browser);
			caps.setCapability("browser_version", browser_version);
			caps.setCapability("os", os);
			caps.setCapability("os_version", os_version);
			caps.setCapability("resolution", resolution);
			caps.setCapability("project", project);
			caps.setCapability("build", build);
			caps.setCapability("browserstack.debug", "true");
			caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			driver = new RemoteWebDriver(new URL(Constants.APPIUM_BS), caps);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}