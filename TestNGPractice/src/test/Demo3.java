package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	
	@BeforeClass
	public void BfClass() {
		System.out.println("*****Before Class*****");
	}
	
	@AfterClass
	public void AfClass() {
		System.out.println("*****After Class*****");
	}
	
	@Test(groups={"Smoke"})
	public void WebLoginCarLoan() {
		//selenium
		System.out.println("Web Login Car Loan");
	}
	
	@Test
	public void MobileLoginCarLoan() {
		//Appium
		System.out.println("Mobile Login Car Loan");
	}
	
	@Test
	public void MobileSigninCarLoan() {
		//Appium
		System.out.println("Mobile Login Car Loan");
	}
	
	@Test
	public void MobileLogOutCarLoan() {
		//Appium
		System.out.println("Mobile Login Car Loan");
	}
	
	@Parameters({"UserName","Password"})
	@Test(enabled=false)
	public void APILoginCarLoan(String u, String p) {
		//Rest API automation
		System.out.println("API Login Car Loan");
		System.out.println("UserName: " + u + "Password: " + p);
	}
}
