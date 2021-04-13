package Exercise3;

public class PersonalMortgage extends Mortgage {
	double total;

	   public PersonalMortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
	       super(mortgageNumber, customerName, amount, interestRate, term);
	       setInterestRate(getInterestRate() + 2);
	       
	       total = amount + (amount * ((interestRate+2)/100));
	   }

	  
	   @Override
	   public String toString() {
	       return "PersonalMortgage:\n" +  getMortgageInfo() + " Total amount owed: $" + total;
	   }

	  
	}

