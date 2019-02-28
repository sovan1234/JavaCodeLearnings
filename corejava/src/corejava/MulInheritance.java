package corejava;

interface Triangle
{
	int h=10,s=5;
	void area();
}

interface Square
{
	int a=5,b=6;
	void area();
}

class Shape implements Triangle,Square
{
	@Override
	public void area() {
		// TODO Auto-generated method stub
		int areasq=a*b;
		System.out.println(areasq+" is the area of Square");
		double areatr=0.5*h*s;
		System.out.println(areatr+" is the area of Triangle");
	}
	
}

public class MulInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj=new Shape();
		obj.area();
	}

}
