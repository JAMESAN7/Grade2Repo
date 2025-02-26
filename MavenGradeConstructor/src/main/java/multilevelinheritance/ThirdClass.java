package multilevelinheritance;

public class ThirdClass extends SecondClass {

	public static void main(String[] args) {
		ThirdClass ob=new ThirdClass();//creating child class object
		ob.multiple();//calling instancemethod within the childclass
		System.out.println("the sum inherited from first class then second class is "+ob.sum());//we should call all the instance methods with object from all the  parent classes before the child class,here its is FirstClass and SecondClass
		ob.setName();//calling from second parent class
		System.out.println("the float sum is "+ob.sum1());calling from second parent class
		

	}
public void multiple()
{
	int a=6;
	int b=7;
	int multiple=a*b;
	System.out.println("the multiple is "+multiple);
}
}
