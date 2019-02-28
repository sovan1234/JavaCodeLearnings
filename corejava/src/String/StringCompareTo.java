package String;

public class StringCompareTo {
	public static void main(String args[]) {
		String str[] = { "i", "a", "K", "C", "P" };
		for (int j = 0; j < str.length; j++) {
			for (int i = j + 1; i < str.length; i++) {
				if (str[i].compareTo(str[j]) < 0) {

					String t = str[j];
					str[j] = str[i];
					str[i] = t;
				}
			}
		}
		for (int j = 0; j < str.length; j++)
			System.out.println(str[j]);
	}
}
