package com.OrangeHRM.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.OrangeHRM.genericScripts.BasePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersClass extends BasePage implements ITestListener
{
	ExtentSparkReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	public void onStart(ITestContext context)
	{
		reporter = new ExtentSparkReporter("./src/test/resources/ExtentReports/Extentreoprt.html");
		reporter.config().setDocumentTitle("OrangeHrmTestSuite");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("TestAutomationSuite");
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("OS", "Win,Linux");
		reports.setSystemInfo("Browsers", "Chrome,Firefox,Operamini");
		System.out.println("All the Testcase Execution");
	}
	public void onFinish(ITestContext context)
	{
		System.out.println("All the Testcase Execution Finished");
		reports.flush();
	}
	public void onTestStart(ITestResult result)
	{
		ExtentTest t = reports.createTest(result.getName());
		t.log(Status.INFO, result.getName()+" This testcase execution is started");
		System.out.println("All the individual Testcase Execution Started");
	}
	public void onTestSuccess(ITestResult result)
	{
		ExtentTest t = reports.createTest(result.getName());
		t.log(Status.PASS, result.getName()+" This testcase execution is success");
		System.out.println("All the individual Testcase Execution Passed "+ result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		ExtentTest t = reports.createTest(result.getName());
		t.log(Status.FAIL, result.getName()+" This testcase execution is failed");
		System.out.println("All the individual Testcase Execution Failed "+ result.getName());
		try {
			GetDefect.CaptureDefect(result.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		ExtentTest t = reports.createTest(result.getName());
		t.log(Status.SKIP, result.getName()+" This testcase execution is skipped");
		System.out.println("All the individual Testcase Execution Skipped "+ result.getName());
	}
}
