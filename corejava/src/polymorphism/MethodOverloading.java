package polymorphism;

class Area
{
	double area;
	double calArea(double a,double b)
	{
		area=a*b;
		return area;
	}
	double calArea(int r)
	{
		area=3.14*r*r;
		return area;
	}
	double calArea(int a,double h)
	{
		area=0.5*a*h;
		return(area);
	}
	void display()
	{
		System.out.println(area);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj1=new Area();
		Area obj2=new Area();
		//Area obj3=new Area();
		obj1.calArea(4);
		obj1.display();
		obj2.calArea(6, 4.0);
		obj2.display();
		obj2.calArea(4.5, 2.0);
		obj2.display();
		
		
	}

}
