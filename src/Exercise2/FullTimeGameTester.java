package Exercise2;


public class FullTimeGameTester extends GameTester

	{

	String name1 =name;

	String stat=status;

	int hours;

	public FullTimeGameTester(String name,String stat,int hours){

		this.hours=hours;

		this.name1=name;

		this.stat=stat;}

	void Fulltime()

	{

		int sum = 3000;

		System.out.println("The salary for the full time game tester: " + name1 + " is:$"+ sum);

	}

	@Override
	void Parttime() {
	// TODO Auto-generated method stub
	
	}
}