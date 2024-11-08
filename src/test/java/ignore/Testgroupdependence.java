package ignore;

import org.testng.annotations.Test;

public class Testgroupdependence {
	@Test(groups = {"smoke"})
	public void test1(){
		System.out.println("smoke ");
	}
	@Test(groups = {"smoke"})
	public void test2(){
		System.out.println("smoke");
	}
	
	@Test(groups = {"smoke"})
	public void test3(){
		System.out.println("smoke");
	}
	@Test(groups = {"regression"})
	public void test5() {
		System.out.println("regression");
	}

	@Test(groups = {"functional"})
	public void test6() {
		System.out.println("functional");
	}

	@Test(groups = {"regression"})
	public void test7() {
		System.out.println("regression ");
	}
	//-->when we run this test case all are executed. In the dependent we call smoke regression, but on the basics of ascii 
	//   functional group also execute when smoke and regression group is fail then we- alwaysRun = true in test level the dependent 
	//   method will be execute other wise the dependent method is skiped .....
	//-->when run this test cases the output or it execute on the basises of ASCII 
	//   you have to create a xml file for group to group dependency (groupdependency.xml)
	
	@Test(dependsOnGroups = {"smoke","regression","functional"},alwaysRun = true)
	public void test0(){
		System.out.println("jeevan");
	}

}
