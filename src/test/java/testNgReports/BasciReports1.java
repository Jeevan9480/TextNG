package testNgReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BasciReports1 {

	public static void main(String[] args) throws Exception {
		ExtentReports extentRep= new ExtentReports();
		File file = new File("report.html");
		ExtentSparkReporter sparkRep= new ExtentSparkReporter(file);
	
		extentRep.attachReporter(sparkRep);
		System.out.println("jeevan");
		extentRep.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		

	}

}
