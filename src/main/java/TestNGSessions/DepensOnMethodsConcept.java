package TestNGSessions;

import org.testng.annotations.Test;

public class DepensOnMethodsConcept {
	
	// If login gets fail somehow, testNg will not execute (skipped) the method which deponds on login
	
	@Test
	public void login() {
     System.out.println("login");
	}
	
	@Test(dependsOnMethods = "login" ,priority =1)
	public void home() {
     System.out.println("home");
	}
	
	@Test(dependsOnMethods = "login" , priority = 2)
	public void search() {
     System.out.println("search");
	}

}
