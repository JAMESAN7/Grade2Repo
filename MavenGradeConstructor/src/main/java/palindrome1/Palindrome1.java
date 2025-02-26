package palindrome1;

public class Palindrome1 {
	int a;
	int rev;

	public static void main(String[] args) 
	{
		Palindrome1 pm=new Palindrome1();
		pm.reverse(323);
		pm.checkPalindrome();

	}
public void reverse(int a)
{
	this.a=a;
int rev=0;
while(a>0)
{
int b=a%10;
rev=rev*10+b;
a=a/10;
this.rev=rev;

}
System.out.println("the reverse of 523 is "+rev);
}
public void checkPalindrome()
{
	
	if (a==rev)
	{
		System.out.println("The given number is palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}
}
}
