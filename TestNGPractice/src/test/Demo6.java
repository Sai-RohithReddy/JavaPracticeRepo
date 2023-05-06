package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo6 {
	@DataProvider
	public Object[][] getData() {
		Object[][] ArrayObj = new Object[3][2];
		
		ArrayObj[0][0] = "firstuser";
		ArrayObj[0][1] = "111";
		
		ArrayObj[1][0] = "seconduser";
		ArrayObj[1][1] = "222";
		
		ArrayObj[2][0] = "thirduser";
		ArrayObj[2][1] = "333";
		
		return ArrayObj;
	}
	
	@Test(dataProvider="getData")
	public void IterationTC(String u, String p) {
		System.out.println("UserName: " + u + " Password: " + p);
	}
	
	@Test(dependsOnMethods= {"IterationTC"})
	public void FailingTC() {
		Assert.assertTrue(false);
	}
}
