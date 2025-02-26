package stringbuffer1;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello World ");
		sb.insert(12, "All");//insert method
		System.out.println(sb);
		sb.append("Thank you");//append metthod
		System.out.println(sb);
		sb.delete(12, 15);//delete method
		System.out.println(sb);
		sb.replace(0, 5, "Hi");//replacemethod
		System.out.println(sb);
		sb.reverse();//reverse method
		System.out.println(sb);
		
	}

}
