package demoTestNG;

import org.testng.annotations.Test;

public class Prioritize {
	
	/*
	
	> there are two way to set a priority one is using XML and another one is set priority like this  
	
	  @Test(priority = 1)--------> set priority
	  public void Signin(){
		System.out.println("signin");
		
	> default value of the priority is 0
	> if we are not  set the  priority it execute based on the ASCII value @64,A=65,Z=90,a=97,z=122.
	> we can pass the negative value in the priority like -1,-2 like this also.
	> We provide the save priority for the two different method based on the ascii value  the method 
	  name is apple and orange  we provide the same priority like 2 first apple wiil be execute and next orange will be execute.
		
	 */
	
	@Test(priority = 1)
	public void Signin(){
		System.out.println("signin");
		
	}
	
	@Test(priority = 2)
	public void login() {
		System.out.println("login");
	}
	
	@Test(priority = 3)
	public void searchfortheflight() {
		System.out.println("search for the flight");
	}
	
	@Test(priority = 4)
	public void bookfortheflight() {
		System.out.println("search foe the flight");
		
	}
	@Test(priority = 5)
	public void saveticket() {
		System.out.println("save tickets");
		
	}
	
	@Test(priority = 6)
	public void logout() {
		System.out.println("log out");
	}

}
