 /*
	> if you want to disable the test in the method level you have two ways one is 
           @Ignore
           public void test1() {
	           System.out.println("test 1");
               }
               
        Second way is 
        
               @Test(enabled = false)
               public void test1() {
	             System.out.println("test 1");
                 }
                 
          but 
           @Ignore
           @Test(enabled = true)
           public void test1() {
	            System.out.println("test 1");
                }  
                
         here first we use the ignore after we used enabled= true. But the test cases is not working in the method level because Ignore is high priority..

	> we use the ignore in the class level non of the method will be execute
	  @Ignore
	  public class Apple{
	  }
	  like this the text will be not execute in the class level 
	  
	> we want to ignore the test in the package level click on the package name, select package, select the check box 
	  it create the package-info.java file
	  in that file 
	  
	  @Ignore
      package ignore;
      import org.testng.annotations.Ignore;
      
      in this ignore package there are two class apple and orange both are not working we do like this this is the way we add ignore in the package level
	              
 */


package ignore;

import org.testng.annotations.Test;

public class Apple {

	
  @Test
  public void test5() {
	  System.out.println("test 5");
  }
  
  
  @Test
  public void test6() {
	  System.out.println("test 6");
  }
  
  
  @Test
	  public void test7(){
		  System.out.println("test 7");
	  }
	  
  
  @Test
	  public void test8(){
		  System.out.println("test 8");
	  }
	  
	  
  }



