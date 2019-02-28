package corejava;

import java.util.*;
class Add {

	void sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number");
		int a=sc.nextInt();
		
		System.out.print("Enter 1st number");
		int b=sc.nextInt();
	
		int s=a+b;
	
	System.out.println("Addition: " +s);
	}
	
}
class Main
{
	public static void main(String args[])
	{
		Add obj=new Add();
		obj.sum();
	}
}
