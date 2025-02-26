package hierarchicalinheritance;

public class Hierachicalchild2 extends HierachicalParent{
	public static void main(String args[])
	{
		Hierachicalchild2 ob=new Hierachicalchild2();
		ob.display(); //invoking parent class instance method properties(can invoke inst variables,instance method,constructors etc
		ob.sum();
	}
	public void sum()
	{
		int a=2;
		int b=3;
		int sum=a+b;
		System.out.println("The sum of values is "+sum);
	}

}
