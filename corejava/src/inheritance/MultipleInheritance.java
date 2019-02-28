package inheritance;

interface Flying
{
	static final int a=10;
	void fly();
	void show();
}
class SuperClass
{
	int b;
	SuperClass()
	{
		b=52;
	}
	void disp()
	{
		System.out.println("b="+b+",disp() from Super Class");
	}
}

class SubClass extends SuperClass implements Flying
{
	SubClass()
	{
		super();
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("a="+a+" is the velocity of plane");
	}
	
	public void disp()			//same method but different implementation
	{
		super.disp();				
		System.out.println("2b="+(2*b)+",disp() from Sub class");
	}
	
	@Override
	public void show() {					
		// TODO Auto-generated method stub
		System.out.println("show() from Sub Class");
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass ob=new SubClass();
		ob.fly();
		ob.disp();
		ob.show();
		
//		SuperClass ob1=new SuperClass();
//		ob1.disp();
	}

}
