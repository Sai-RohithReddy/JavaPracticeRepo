//Class is an collection of variables and methods
//Objects are instances of a class
//Method are block of code which contains a logic

package Oop;

public class OopClassObject {
	//Class
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display()//Method
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}
	
	public static void main(String args[])
	{
		OopClassObject emp1 = new OopClassObject();//Object creation
		emp1.eid=101;
		emp1.ename="David";
		emp1.sal=25000.00;
		emp1.deptno=10;
		emp1.job="Manager";
		emp1.display();
		
		OopClassObject emp2 = new OopClassObject();//Object creation
		emp2.eid=102;
		emp2.ename="Smith";
		emp2.sal=55000.00;
		emp2.deptno=20;
		emp2.job="Developer";
		emp2.display();
	}

}
