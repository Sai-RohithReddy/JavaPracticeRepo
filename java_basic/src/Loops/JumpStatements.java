package Loops;

public class JumpStatements {

	public static void main(String[] args) {
		for(int i = 1;i <= 10; i++)
		{
			if(i == 2 || i == 5)
			{
				continue;
			}
			if (i == 9)
			{
				break;
			}
			System.out.println(i);
		}

	}

}
