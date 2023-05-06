package Oop;

public class StudentMain {

	public static void main(String[] args) {
/*		
		//we can assign values to variables in 3 ways
		StudentClass std1 = new StudentClass();
		
		//By using reference variable
		std1.sid=101;
		std1.sname="Rohith";
		std1.grade='A';
		std1.display();
		
		//By using method
		std1.getValues(102, "Reddy", 'A');
		std1.display();
		
		//By using constructor
		//1) it is a special type of method.
		//2) used for initializing the class variable
		//3) name should be same as class name
		//4) will not return any values(not even void)
		//5) it will be invoked at the time of object creation
*/		
		StudentClass std1 = new StudentClass(103, "Nani", 'A');
		std1.display();
	}

}
