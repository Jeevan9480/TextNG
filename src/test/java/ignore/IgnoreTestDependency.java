package ignore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTestDependency {
	static String TrackingNumber = null;

	@Ignore
	@Test
	public void Createshipment() {
		System.out.println("TrackingNumber");
		TrackingNumber = "ABCE234";

	}

//  @Test(dependsOnMethods =  {"TrackingNumber"},ignoreMissingDependencies = true) here we used ignoreMissingDependencies =true  
//                              when the method Createshipment is skip delete or ignore the next method TrackingNumber is executing.

	@Test(dependsOnMethods = { "Createshipment" }, ignoreMissingDependencies = true)
	public void TrackingNumber() throws Exception {
		if (TrackingNumber != null) {
			System.out.println("createshipment");
		} else { 
			throw new Exception("Invalied trackingNumber");

		}
	}

	@Test()
	public void Cancelshipment() throws Exception {
		if (TrackingNumber != null) {
			System.out.println("Cancelshipment");

		} else {
			throw new Exception("Invalied TrackingNumber");
		}
	}
}
