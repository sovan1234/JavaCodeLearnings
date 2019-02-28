package exception;

class MyException extends Exception
{
	private int n;
	MyException(int a)
	{
		n=a;
	}
	public String toString()
	{
		return("OddNumberException:"+n);
	}
}

public class CustomException {

	static void comp(int a) throws MyException
	{
		
		if(a%2!=0)
			throw new MyException(a);
		else
			System.out.println("Normal Exception");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			comp(14);
			comp(15);
		}
		catch(MyException e)
		{
			System.out.println("Caught:"+e);
		}
	}

}
