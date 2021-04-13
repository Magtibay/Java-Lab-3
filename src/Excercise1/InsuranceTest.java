package Excercise1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsuranceTest {
		
	public static void main(String[] args) {

		List<Insurance> list =new ArrayList<>();

		Scanner sc =new Scanner(System.in);

		String choice="";

		while(true) {

			Insurance ins=null;

			System.out.print("Enter '1' if you wish to continue to enter your insurance.\nEnter '2' if you wish to exit:");

			choice=sc.nextLine();

			if(choice.equalsIgnoreCase("2"))
				
				break;

			System.out.print("Please enter your insurance type:");

			String type=sc.nextLine();

			System.out.print("Please enter the monthlly cost:");

			double cost=sc.nextDouble();

			sc.nextLine();

			if(type.equalsIgnoreCase("health")) {

				ins=new Health();

				ins.setMonthlyCost(cost);

				ins.displayInfo();

			}

			else if(type.equalsIgnoreCase("life")) {

				ins=new Life();

				ins.setMonthlyCost(cost);

				ins.displayInfo();

			}
			
			else {
				System.out.print("Error. Please only enter 'health' or 'life' type of insurance. Thank you.\n");
			}

		}

	}

}

