package packagegrade1;

import java.util.Scanner;

public class Grade2 {
public static void main(String args[])
{
	Grade2 gr1=new Grade2();
	Grade2 gr2=new Grade2(55,57);

	
	/*if (sum1>165)
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
			
				System.out.println("The first student is failed")	;
				
		}*/
	
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
 

}
public Grade2(int a ,int b)
{
	int sum2=a+b;
	System.out.print(" the total mark for second student"+sum2);
 

}

}
