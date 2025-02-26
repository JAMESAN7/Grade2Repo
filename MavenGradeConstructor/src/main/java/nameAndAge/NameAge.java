package nameAndAge;

import java.util.Scanner;

public class NameAge {

	/*{
		NameAge nm=new NameAge();
		System.out.println("My name is "+nm.name());
		System.out.println("My age is "+nm.age());
		
		
	}*/

	public static void main(String[] args)
	{
		NameAge nm=new NameAge();
		nm.nameandage();
		
	}
	/*public String name()
{
	System.out.println("Enter the Name");
	Scanner sc=new Scanner(System.in);
	String name1=sc.next();
	return name1;
	
}
public int age()
{
	System.out.println("Enter the Age");
	Scanner sc=new Scanner(System.in);
	int age1=sc.nextInt();
	return age1;
	
}*/
public void nameandage()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name ");
	String name1=sc.next();
	System.out.println("Name is "+name1);
	System.out.println("Enter the age ");
	int age1=sc.nextInt();
	System.out.println("Age is "+age1);
	
}
}
