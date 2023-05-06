package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo4 {
	@Test(dependsOnMethods= {"APILoginCarLoan","MobileLoginCarLoan"})
	public void WebLoginHomeLoan() {
		//selenium
		System.out.println("Web Login Home Loan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan() {
		//Appium
		System.out.println("Mobile Login Home Loan");
	}
	
	@Test
	public void APILoginCarLoan() {
		//Rest API automation
		System.out.println("API Login Home Loan");
	}
	
	@Test(enabled=false)
	public void DefectTc() {
		// Defect TC, if we can't to execute it chance enabled to true.
		System.out.println("XXXX");
	}
	
	@Test(timeOut=4000)
	public void MoreExecutionTimeTC() {
		System.out.println("Waits for max 40 sec..");
	}
	
	@Parameters({"URL"})
	@Test
	public void AddParameters(String urlname) {
		System.out.println(urlname);
	}
}
