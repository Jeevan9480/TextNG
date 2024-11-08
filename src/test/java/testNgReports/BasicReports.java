package testNgReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BasicReports {

	public static void main(String[] args) {
		ExtentReports exrep= new ExtentReports();
		ExtentSparkReporter sparkrep=new ExtentSparkReporter("C:\\Users\\jeevan.k\\eclipse-workspace\\demoTestNG");

	}

}
