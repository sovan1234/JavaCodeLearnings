package String;

public class Stringconcate {
	public static void main(String args[]) {
		String age = "9";
		String s = "He is" + " " + age + " " + "years old";
		String s1 = "He is";
		String s2 = s1.concat(age);
		System.out.println(s);

		System.out.println(s2);
	}
}
