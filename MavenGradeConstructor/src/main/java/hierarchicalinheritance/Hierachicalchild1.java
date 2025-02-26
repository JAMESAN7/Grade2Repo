package hierarchicalinheritance;

public class Hierachicalchild1 extends HierachicalParent {

	public static void main(String[] args) {
		Hierachicalchild1 ob=new Hierachicalchild1();
		ob.display();
		System.out.println("My name is "+ob.getName());
			

	}
	public String getName()
	{
		String s="Anitta James";
		return s;
	}

}
