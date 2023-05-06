//TestNG can act as java compiler, we don't need to call main()
//at higher level TestNG will run java, but at back end it will depend on Java only

package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	// for running tests we need to define methods
	@Test
	public void TC1() {
		System.out.println("Test Case 1");
	}
	
	@Test
	public void TC2() {
		System.out.println("Test Case 2");
	}
	
	@BeforeMethod
	public void BfEvery() {
		System.out.println("*****Before test case*****");
	}
	
	@AfterMethod
	public void AfEvery() {
		System.out.println("*****After test case*****");
	}
}
