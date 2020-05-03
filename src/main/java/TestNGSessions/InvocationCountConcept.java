package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	// Invocation count 10 means it will invoke or run 10 times
	// eg to create the user 10 times we use invocation count and mostly used in API testing
	
	@Test(invocationCount = 10)
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test(invocationCount = 10)
	public void createUserTest() {
		System.out.println("create User Test API");
	}


}
