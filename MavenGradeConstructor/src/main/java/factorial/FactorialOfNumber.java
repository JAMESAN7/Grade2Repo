package factorial;

public class FactorialOfNumber {
	int fact;

	public static void main(String[] args)
	{
		FactorialOfNumber fn=new FactorialOfNumber();
		fn.display1();

	}
	public void display1()
	{
		this.factorial1(4);
		System.out.println("the factorial is "+fact);
		
	}
	public void factorial1(int a)
	{
		 fact=1;
		int b=a;
		for(int i=1;i<=b;i++)
		{
		
		fact=fact*a;
	
		a=a-1;
		
		}
	//this.fact=fact;	
			
	}

}
