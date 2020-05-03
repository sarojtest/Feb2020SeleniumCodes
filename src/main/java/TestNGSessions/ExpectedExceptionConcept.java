package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void test1() {
		System.out.println("test1");
		int i =9 /0;
		System.out.println("ABCD");   // Flow will not reach here, since not handled
	}

}
