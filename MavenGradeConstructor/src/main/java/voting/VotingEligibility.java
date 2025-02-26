package voting;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		VotingEligibility ve=new VotingEligibility();
		System.out.println(ve.votingeligible());
	}

public boolean votingeligible()

{
	System.out.println("Enter the age of the candidate");
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
if(age>=18) 
{
System.out.println("The candidate is eligible for Voting");	
boolean b=true;
return b;

}
else
{
	System.out.println("The candidate is not eligible for Voting");	
	boolean b=false;
	return b;
}

}
	}


