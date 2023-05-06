package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void ploan() {
		System.out.println("Test Case 3");
	}
	
	@BeforeTest
	public void Prerequist() {
		System.out.println("*****I will execute first in particular module*****");
	}
	
	@AfterTest
	public void LastExecution() {
		System.out.println("*****I will execute last in particular module*****");
	}
}
