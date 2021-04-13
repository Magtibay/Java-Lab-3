package Exercise3;

public abstract class Mortgage implements MortgageConstants {
	   private int mortgageNumber;
	   private String customerName;
	   private double amount;
	   private double interestRate;
	   private int term;
	  
	  
	   /**
	   * @return the mortgageNumber
	   */
	   public int getMortgageNumber() {
	       return mortgageNumber;
	   }

	   /**
	   * @param mortgageNumber the mortgageNumber to set
	   */
	   public void setMortgageNumber(int mortgageNumber) {
	       this.mortgageNumber = mortgageNumber;
	   }

	   /**
	   * @return the customerName
	   */
	   public String getCustomerName() {
	       return customerName;
	   }

	   /**
	   * @param customerName the customerName to set
	   */
	   public void setCustomerName(String customerName) {
	       this.customerName = customerName;
	   }

	   /**
	   * @return the amount
	   */
	   public double getAmount() {
	       return amount;
	   }

	   /**
	   * @param amount the amount to set
	   */
	   public void setAmount(double amount) {
	       this.amount = amount;
	   }

	   /**
	   * @return the interestRate
	   */
	   public double getInterestRate() {
	       return interestRate;
	   }

	   /**
	   * @param interestRate the interestRate to set
	   */
	   public void setInterestRate(double interestRate) {
	       this.interestRate = interestRate;
	   }

	   /**
	   * @return the term
	   */
	   public int getTerm() {
	       return term;
	   }

	   /**
	   * @param term the term to set
	   */
	   public void setTerm(int term) {
	       this.term = term;
	   }

	  
	  
	   public Mortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
	       super();
	       this.mortgageNumber = mortgageNumber;
	       this.customerName = customerName;
	       if(amount <= MAXAMOUNT)
	           this.amount = amount;
	       else
	           this.amount =MAXAMOUNT;
	       this.interestRate = interestRate;
	       if(term != 3 || term != 5 )
	           this.term = SHORTTERM;
	   }
	  
	   public String getMortgageInfo() {
	       return "[mortgageNumber=" + mortgageNumber + ", customerName=" + customerName + ", amount=" + amount
	               + ", interestRate=" + interestRate + ", term=" + term + "]";
	   }

	  
	   @Override
	   public String toString() {
	       return "Mortgage [mortgageNumber=" + mortgageNumber + ", customerName=" + customerName + ", amount=" + amount
	               + ", interestRate=" + interestRate + ", term=" + term + "]";
	   }


	}
