//ITestListner is the interface which have all the methods for this TestNG Listener
//ITestListner interface which implements Testing listeners

package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("\n I failed execution-> " + result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I successfully executed Listeners pass code");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("I skipped executing");
	}
}
