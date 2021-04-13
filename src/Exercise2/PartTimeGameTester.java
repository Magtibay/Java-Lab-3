package Exercise2;




	public class PartTimeGameTester extends GameTester

	{

		String name1=name;

		String stat=status;

		int hours;

		public PartTimeGameTester(String name,String stat,int hours){

			this.hours=hours;

			this.name1=name;

			this.stat=stat;}

		void Parttime()

		{

			int sum = hours*20;

			System.out.println("The salary for part-time game tester: " + name1 + " is: $" + sum);

		}

		@Override
		void Fulltime() {
	// TODO Auto-generated method stub
	
	}	

}