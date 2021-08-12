package Academy;


import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports {
	ExtentReports extent;
	public void reports() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("web results");
		reporter.config().setDocumentTitle("test results");
		 extent =new ExtentReports();
//			extent.attachReporter(reporter);
//			extent.setSystemInfo("Tester", "Tarun");
		
	}

}
