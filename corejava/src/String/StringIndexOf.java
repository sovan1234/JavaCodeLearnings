package String;

import java.util.Scanner;

public class StringIndexOf {
	public static void main(String args[]) {
		String s = "now is the time for all good man to come to the aid of the country";
		System.out.println(s.indexOf('t'));

		System.out.println(s.indexOf("the"));
		System.out.println(s.lastIndexOf('t'));
		System.out.println(s.lastIndexOf("time"));
		System.out.println(s.lastIndexOf("lemon"));
		String ob = s.substring(5);
		System.out.println(ob);
		String ob1 = s.substring(4, 10);
		System.out.println(ob1);
		String obj = "Hello";
		String ob2 = obj.replace('l', 'w');
		System.out.println(ob2);
		String s1 = "THIS IS A JAVA TEST";
		System.out.println(s1.toLowerCase());
		String s2 = "this is a java test";
		System.out.println(s2.toUpperCase());
		StringBuffer s3 = new StringBuffer("JAVA");
		System.out.println(s3.reverse());
		StringBuffer s4 = new StringBuffer("I java");
		System.out.println(s4.insert(2, " like "));
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");

		String s8 = in.next();
		StringBuffer s9 = new StringBuffer(s8);
		System.out.println(s9);
		System.out.println(s9.reverse());
		StringBuffer obj1 = new StringBuffer(s9.append(" Khuki "));
		System.out.println(obj1);
	}
}
