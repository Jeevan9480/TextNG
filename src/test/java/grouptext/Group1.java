
package grouptext;

import org.testng.annotations.Test;

/* we decelare the @Test(groups={"all"}   in the class level all the method in side the class 
  will be excecute if the method  part of the group are not a part of the group it will be execute.
                          that is called partial group...........       
*/

@Test//(groups = {"All"})
public class Group1 {
	
	
	/*


	@Test(groups = {"smoke"})
	public void test1(){
		System.out.println("test 1");
	}

	@Test(groups = {"smoke","functional"})
	public void test2() {
		System.out.println("test 2");
	}

	@Test(groups = {"smoke"})
	public void test3() {
		System.out.println("test 3");
	}

	@Test(groups = {"functional","regression"})
	public void test4() {
		System.out.println("test 4");
	}
	@Test
	public void test9() {
		System.out.println("test 9");
	}
	
*/
	
}
