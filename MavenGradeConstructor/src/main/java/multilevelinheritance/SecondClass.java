package multilevelinheritance;

public class SecondClass extends FirstClass {

	public static void main(String[] args) {
		SecondClass ob=new SecondClass();//creating child class object
		System.out.println("the sum inherited from firts class is "+ob.sum());//inherited instance method has return type
		ob.setName();
		System.out.println("the float sum is "+ob.sum1());

		
		
	}
	public void setName()
	{
		String s="Ciril James";
		System.out.println("the name is "+s);
		
	}
	public float sum1()
	{
		float f=2f;
		float b=4.5f;
		float sum1=f+b;
		return sum1;
	}

}
