package Excercise1;


public abstract class Insurance {

		private String typeInsurance;
		private double monthlyCost;


		public Insurance(String typeInsurance) {

			this.setTypeInsurance(typeInsurance);

			}


		public String getTypeInsurance() {
			return typeInsurance;
		}


		public void setTypeInsurance(String typeInsurance) {
			this.typeInsurance = typeInsurance;
		}


		public double getMonthlyCost() {
			return monthlyCost;
		}


		public void setMonthlyCost(double monthlyCost) {
			this.monthlyCost = monthlyCost;
		}

	

		public abstract void setInsuranceCost(double cost);
	
		public abstract void displayInfo();

	}
