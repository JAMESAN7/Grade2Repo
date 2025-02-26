package discount;

public class Discount1 {
	int sum;

	public static void main(String[] args) {
		Discount1 ds=new Discount1();
		ds.totalprice(2000,300,2000,4000);
	//	ds.discountcheck();
		

	}
	public void totalprice(int a, int b,int c, int d)
	{
		int sum=a+b+c+d;
		System.out.println("Total prices of commodities is "+sum);
		this.sum=sum;
		this.discountcheck();
		
	}
	public void discountcheck()

	{
		if (sum>5000)
		{
			int discount=sum*20/100;
			sum=sum-discount;
			
		}
		System.out.println("The sum is "+sum);
	}

}
