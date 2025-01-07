package extent_Report;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class Listener_Report implements ITestListener {
	public ExtentSparkReporter reporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		reporter=new ExtentSparkReporter("C:\\Users\\Hp\\eclipse-workspace\\Testing_project\\testngreports\\Adactintestcasereport.html");
		reporter.config().setDocumentTitle("Adactin_test report");
		reporter.config().setReportName("Adactin entire system");
		reporter.config().setTheme(Theme.STANDARD);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("user", "Rakesh");
		extent.setSystemInfo("host", "localhost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("browsers", "chrome,edge");
	}
	public void onTestSuccess(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	}
	public void onTestFailure(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		
	}
	public void onTestSkipped(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.YELLOW));
		
		
	}
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
