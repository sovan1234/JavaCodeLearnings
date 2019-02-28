package corejava;

interface Flying
{
	int a=10;
	void fly();
	void show();
}

class Bird implements Flying
{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(""+a+" is the speed of the bird");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show() From Bird Class");
	}
	
}

class Plane implements Flying
{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(""+(a+1)+" is the speed of the plane");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show() From bird Class");
	}
	
}

public class InterfaceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird b=new Bird();
		Plane p=new Plane();
		b.fly();
		b.show();
		p.fly();
		p.show();
	}

}
