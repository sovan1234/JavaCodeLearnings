package exception;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=args.length;
			int b=42/a;
			System.out.println("a="+a);
			try
			{
				if(a==1)
					a=a/(a-a);
				if(a==2)
				{
					int c[]={1};
					c[42]=99;
				}
			}
				catch(ArrayIndexOutOfBoundsException ae)
				{
					System.out.println("Array Index Out Of Bound");
				}
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Divide by zero");
			}
		}
	
}
