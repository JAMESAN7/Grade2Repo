package stringmethods;

public class Stringmethods {

	public static void main(String[] args) {
		String s="Hello World";
		System.out.println(s.length());//length method
		System.out.println(s.charAt(6));//Get character from specific index position
int a=3;
String c=String.valueOf(a);//convert any datatype to String
System.out.println(c);
String s1="hello World";
String s2=new String("hello World");
System.out.println(s.equals(s1));//compare two string values (content and case)and return boolean value
System.out.println(s1.equals(s2));
System.out.println(s.equalsIgnoreCase(s1));//compares only the content of two strings(not case)
String b="Hello";
System.out.println(b.isEmpty());//check whether the String empty or not and return boolean value
String d="Anitta";
String e=d.concat(" James");//adding two string values
String f=e.concat(" Hello");
System.out.println(f);

	}

}
