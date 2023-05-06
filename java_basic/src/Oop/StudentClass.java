package Oop;

public class StudentClass {

	int sid;
	String sname;
	char grade;
	
	void display()
	{
		System.out.println(sid+" "+sname+" "+grade);
	}
	
	void getValues(int id, String name,char g)//method
	{
		sid = id;
		sname = name;
		grade = g;
	}
	
	StudentClass(int id, String name,char g)//constructor
	{
		sid = id;
		sname = name;
		grade = g;
	}
}
