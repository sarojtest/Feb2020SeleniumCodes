package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	
	// Test will execute alphabetically till we not mention Priority
	// now based on priority it will execute . If priority will same it will pick alphabetically again
	// Priorityy can be common, priority may be zero and will follow integer order
	
	//TestNg execute non priority test cases first

		@Test(priority = 2)
		public void atest() {
			System.out.println("A test");
		}
		@Test(priority = 4)
		public void btest() {
			System.out.println("B test");
		}
		@Test(priority = 1)
		public void ctest() {
			System.out.println("C test");
		}
		@Test(priority = 3)
		public void dtest() {
			System.out.println("D test");
		} 
		// Non priority test executes first and matching on alphatebetic order
		@Test
		public void etest() {
			System.out.println("E test");
		}
		
		
		
	}


