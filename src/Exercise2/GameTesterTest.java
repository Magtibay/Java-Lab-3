package Exercise2;

import java.util.Scanner;

public class GameTesterTest {
	
	

		public static void main(String[] args) {

		{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the name of Game Tester:");

		String str1=sc.nextLine();

		System.out.print("Enter 'full' or 'part' depending on employee position:");

		String str2=sc.nextLine();

		System.out.print("Enter the number of hours worked:");

		int sal=sc.nextInt();

		if(str2.equalsIgnoreCase("FULL"))

		{

		FullTimeGameTester obj = new FullTimeGameTester(str1,str2,sal);

		obj.Fulltime();

		}

		else if(str2.equalsIgnoreCase("PART"))

		{

		PartTimeGameTester ob=new PartTimeGameTester(str1,str2,sal);

		ob.Parttime();

		}
		
		else {
			System.out.print("Error. Please only enter 'full' or 'part' positions. Thank you.\n");

			}

		}

		}
}


