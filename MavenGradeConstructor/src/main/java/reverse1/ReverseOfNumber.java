package reverse1;
//import java.util.*;

public class ReverseOfNumber {
	int a;
int rev;
	public static void main(String[] args) {
		
		ReverseOfNumber rn=new ReverseOfNumber();
		rn.instancemethod1();
		
	}
	public void instancemethod1()
	{
	System.out.println("Display the instance variable "+a)	;
		
	}
	
	public ReverseOfNumber()
	{
	this(523);
	System.out.println("The reverse of the number from Display constructor is  "+rev);

	
	}
	public ReverseOfNumber(int a)
	{
	this.a=a;
	int rev=0;
	while(a>0)
	{
	int b=a%10;
	rev=rev*10+b;
	a=a/10;
	}
	this.rev=rev;
	//System.out.println("The reverse of the number is "+rev);
	
	
	}

}
