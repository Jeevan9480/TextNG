package demoTestNG;

import org.testng.annotations.Test;

public class Testdependency {
	
	static String TrackingNumber = null;
	@Test(priority = 0)
	public void Createshipment() {
		// System.out.println(5/0);  
		System.out.println("Createshipment");
		TrackingNumber = "ASD3456";
	}
        /* if we add dependsOnMethods when the first step is failed where ever we use the name of the first method
	        in the dependency those step are skiped .*/
	
	  //why we add dependsOnMethods because dependency on  method level.
	                                                           //it accepet only the string types of array
															  // after adding the dependency there is no need to set priority
	
	
//@Test(dependsOnMethods = {"Createshipment"},alwaysRun = true) -->when we right like this if the dependence "createshipment "is failed also Trackshipment method is run.
	@Test(dependsOnMethods = {"Createshipment"})
	public void Trackshipment() throws Exception {
		if (TrackingNumber != null) {
			System.out.println("Trackshipment");
		} 
		else {
			throw new Exception("invalied tracking number");
		}
	}

	@Test(dependsOnMethods = {"Createshipment","Trackshipment"}) //here what we are telling is if the first method and second method is pass then only execute the third method. 
	public void Cancelshipment() throws Exception {
		if (TrackingNumber != null) {
			System.out.println("Cancelshipment");
		} 
		else {
			throw new Exception("invalied tracking number");
		}
	}
}
