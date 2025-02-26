package inheritance1;

public class SingleInheritanceChildclass extends SingleInheritances1{

	public static void main(String[] args) {
		SingleInheritanceChildclass ob=new SingleInheritanceChildclass();
		ob.display();
		System.out.println(ob.a);
		ob.displaychild();
	}
	public void displaychild()
	{
		int b=2;
		int c=4;
		int sum=c+b;
		System.out.println(sum);
	}

}
