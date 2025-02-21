package packagegrade1;

import java.util.Scanner;

public class Grade2 {
	int sum1;
	int sum2;
public static void main(String args[])
{
	Grade2 gr1=new Grade2();
	Grade2 gr2=new Grade2(55,57);
	
	System.out.println("The returned value of total mark os student1 is sum1 "+gr1.instancesum1());
	System.out.println("The returned value of total mark os student2 is sum2 "+gr2.instancesum2());//call 2 methods in 2 different objetcs,ie of the constructor used to assign the instance variable value with this keyword
	
	int sum1=gr1.instancesum1();//assign returned sum value to a new variable
	int sum2=gr2.instancesum2();
	
	if (sum1>165)
	{
	System.out.println("The grade of first student is A")	;
	}
	else if(sum1>145)
	{
		
			System.out.println("The grade of first student is B")	;
			
	}
	else if(sum1>125)
	{
		
			System.out.println("The grade of first student is C")	;
			
	}
	else
	{
			
				System.out.println("The first student is failed")	;
				
		}
	if (sum2>165)
	{
	System.out.println("The grade of first student is A")	;
	}
	else if(sum2>145)
	{
		
			System.out.println("The grade of first student is B")	;
			
	}
	else if(sum2>125)
	{
		
			System.out.println("The grade of first student is C")	;
			
	}
	else
	{
			
				System.out.println("The second student is failed")	;
				
		}
	
}
public Grade2()
{
	
Scanner sc=new Scanner(System.in);
System.out.println("enter the Mark1 for first student");
int a=sc.nextInt();
System.out.println("enter the mark2 for first student");
int b=sc.nextInt();
int sum1=a+b;
System.out.println(" The total mark of first student "+sum1);
this.sum1=sum1;
 

}
public Grade2(int a ,int b)
{
	int sum2=a+b;
	this.sum2=sum2;
	System.out.println(" the total mark for second student "+sum2);
 

}
public int instancesum1()
{
	//System.out.println("The assigned value of sum1 from first constructor to first instance method using this keyword  "+sum1);
	return sum1;
	
}
public int instancesum2()
{
	//System.out.println("The assigned value of sum2 from second constructor to second instance method using this keyword  "+sum2);
	return sum2;
}

}
