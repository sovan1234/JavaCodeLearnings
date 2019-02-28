package corejava;

abstract class Shape1
{
	int a=6,b=7;
	abstract void area();
	void color()
	{
		System.out.println("Shape color is Red");
	}
}

class Triangle1 extends Shape1
{

	@Override
	void area() {
		// TODO Auto-generated method stub
		double area=0.5*a*b;
		System.out.println("area of triangle="+area);
		
	}
	
}

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle1 obj=new Triangle1();
		obj.color();
		obj.area();
	}

}
