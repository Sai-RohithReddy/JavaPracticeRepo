package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Demo5 {
	@BeforeSuite
	public void BfSuit() {
		System.out.println("*****I will execute first in Suit*****");
	}
	
	@AfterSuite
	public void AfSuit() {
		System.out.println("*****I will execute last in Suit*****");
	}
}
