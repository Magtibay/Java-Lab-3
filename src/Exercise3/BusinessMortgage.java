package Exercise3;

public class BusinessMortgage extends Mortgage {
	
	double total;

	   public BusinessMortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
	       super(mortgageNumber, customerName, amount, interestRate, term);
	       setInterestRate(getInterestRate() + 1);
	       
	       total = amount + (amount * ((interestRate+1)/100));
	   }


	   @Override
	   public String toString() {
	       return "BusinessMortgage:\n" + getMortgageInfo() + " Total amount owed: $" + total;
	   }

	  
	}