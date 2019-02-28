package exception;

class MultipleCatch {
	public static void main(String args[])

	{
		int a[] = { 5, 10 };
		int b = 5;
		int c;
		try {
			c = a[0] / (a[0] - b);
			System.out.println(c);
			try {
				c = a[2] / b - a[1];
				System.out.println(c);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array range out bounds");
			}
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero");
		}

	}

}
