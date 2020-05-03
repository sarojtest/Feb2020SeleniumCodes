package TestNGSessions;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListenerTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
    System.out.println("test case started---->" + result.getName());		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
     System.out.println("test case is successful --->" + result.getName());		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	     System.out.println("test case is failed --->" + result.getName());	
	     System.out.println("taking screenshot --- ");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	     System.out.println("test case is skipped --->" + result.getName());	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
