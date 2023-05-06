package java_basic;

public class MethodsCalculation {
	int x = 10;
	int y = 20;
	//not taking parameters and also not returned any value
	void sum()//void returns nothing
	{
		System.out.println(x+y);
	}
	//not taking parameters but returning value
	int sum1()
	{
		return x+y;
	}
	//taking parameters, but not returning any value
	void sum2(int X,int Y)
	{
		System.out.println(X+Y);
	}
	//method is taking parameters and also returning a value
	int sum3(int a, int b)
	{
		return (a+b);
	}

	public static void main(String[] args) {
		MethodsCalculation cal = new MethodsCalculation();
		
		cal.sum();
		
		int res = cal.sum1();
		System.out.println(res);
		System.out.println(cal.sum1());
		
		cal.sum2(100, 200);
		
		int res2=cal.sum3(200, 300);
		System.out.println(res2);
		System.out.println(cal.sum3(200,300));

	}

}
