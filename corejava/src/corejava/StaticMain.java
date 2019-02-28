package corejava;

class Static
{
	
	double mul(int a,int b)
	{
		double r;
		r=a*b;
		return r;
	}
	static double add(int a,int b)
	{
		double r;
		r=a+b;
		return r;
	}
}

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static obj=new Static();
		
		double q=obj.mul(5, 8);
		double p=Static.add(3, 8);
		System.out.println(p);
		System.out.println(q);
		
		
	}

}
