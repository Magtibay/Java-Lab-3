package Exercise3;

import java.util.Scanner;

public class ProcessMortgage {

   public static void main(String[] args) {
       Mortgage[] loans=new Mortgage[3];
       int choice;
       int number=0;
       String name="";
       double amount=0.0;
       double rate=0.0;
       int term;
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<3;i++) {
       System.out.print("Please enter '1' for 'Personal Mortgage' or enter '2' for 'Business Mortgage': ");     
       choice=sc.nextInt();
       if(choice==1) {
           System.out.print("Enter number:");
           number=sc.nextInt();
           System.out.print("Enter name:");
           name=sc.next();
           System.out.print("Enter amount:");
           amount=sc.nextDouble();
           System.out.print("Enter interestRate:");
           rate=sc.nextDouble();
           System.out.print("Enter term in years:");
           term=sc.nextInt();
           Mortgage m1=new PersonalMortgage(number,name,amount,rate,term);
           loans[i]=m1;
       }
       if(choice==2) {
           System.out.print("Enter number:");
           number=sc.nextInt();
           System.out.print("Enter name:");
           name=sc.next();
           System.out.print("Enter amount:");
           amount=sc.nextDouble();
           System.out.print("Enter interestRate:");
           rate=sc.nextDouble();
           System.out.print("Enter term in years:");
           term=sc.nextInt();
           Mortgage m2=new BusinessMortgage(number,name,amount,rate,term);
           loans[i]=m2;

       }
       }  
       //Displaying loans
       for(int i=0;i<3;i++)
       {
           System.out.println(loans[i].toString());
       }

   }

}