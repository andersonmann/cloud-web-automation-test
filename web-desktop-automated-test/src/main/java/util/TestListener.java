package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import core.BrowserFactory;

/**
 * @author anderson.mann
 *
 */
public class TestListener extends BrowserFactory implements ITestListener {
	private ExtentTestManager log = new ExtentTestManager();

	public void onStart(ITestContext context) {
		System.out.println("*** Test Suite " + context.getName() + " started ***");
	}

	public void onFinish(ITestContext context) {
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

	public void onTestStart(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
		ExtentTestManager.startTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
		log.getTest().log(Status.PASS, "Test passed");
//		captureScreenShot(result, "pass");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
		log.getTest().log(Status.FAIL, "Test Failed");
//		captureScreenShot(result, "fail");
	}

	public String getTestClassName(String testName) {
		String[] reqTestClassname = testName.split("\\.");
		int i = reqTestClassname.length - 1;
		System.out.println("Required Test Name : " + reqTestClassname[i]);
		return reqTestClassname[i];
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
		log.getTest().log(Status.SKIP, "Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
	}

	// Function to capture screenshot.
	public void captureScreenShot(ITestResult result, String status) {
		String destDir = "";
		String passfailMethod = result.getMethod().getRealClass().getSimpleName() + "."
				+ result.getMethod().getMethodName();
		// To capture screenshot.
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// If status = fail then set folder name "screenshots/Failures"
		if (status.equalsIgnoreCase("fail")) {
			destDir = "screenshots/Failures";
		}
		// If status = pass then set folder name "screenshots/Success"
		else if (status.equalsIgnoreCase("pass")) {
			destDir = "screenshots/Success";
		}

		// To create folder to store screenshots
		new File(destDir).mkdirs();
		// Set file name with combination of test class name + date time.
		String destFile = passfailMethod + ".png";

		try {
			// Store file at destination folder location
			FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}