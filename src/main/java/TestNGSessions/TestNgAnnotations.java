package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	//pre conditions-->Test + Asserts--->post steps
	//Before Annotations----> @Test-----> After Annotations
	
	/**
	 * before suite method
before test method
before class method

before  method
test 1
after method

before  method
test 2
after method

after class method
after test method
after suite method
PASSED: test1

BS
BT
BC

BM  t1 AM
BM  t2 AM

AC
AT
AS

example here.....

prepare test data
Create DB connection
Launch Browser and URL

login to app
check user details
log out

login to app
check user is created or not
log out
close the browser
disconnect the DB


	 */
	
	//1
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("prepare test data");
	
	}//2
	@BeforeTest
	public void beforeTest() {
		System.out.println("Create DB connection");
	}
	//3
	@BeforeClass
	public void beforeClass() {
		System.out.println("Launch Browser and URL");
	}
	//4 7
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("login to app");
	}
	//5
	@Test
	public void test1() {
		System.out.println("check user details");
	}
	// 8
	@Test 
	public void test2() {
		System.out.println("check user is created or not");
	}
	//6 9
	@AfterMethod
	public void afterMetod() {
		System.out.println("log out");
	}
	//10
	@AfterClass
	public void afterClass() {
		System.out.println("close the browser");
		
	}
	//11
	@AfterTest
	public void afterTest() {
		System.out.println("disconnect the DB");
	}
	//12
	@AfterSuite
	public void afterSuite() {
		System.out.println("delete the test data");
	}
	
	
	
	

}
