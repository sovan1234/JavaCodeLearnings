package abstraction;

abstract class Figure {        //abstract class
	double r;
	double area;
	Figure(double p) {			//non-abstract
		r = p;

	}

	abstract double calArea();   //abstract method
}

class Circle extends Figure {       //inheriting
	double p;

	Circle(double c) {
		super(c);
	}

	double calArea() {				//defining the body of abstract method
		//double area;
		area = 3.141 * r * r;
		return (area);
	}
}

class Triangle extends Figure {
	
	double s;

	Triangle(double p,double q) {
		super(p);
		s=q;
		// TODO Auto-generated constructor stub
	}

	@Override
	double calArea() {
		// TODO Auto-generated method stub
		area=0.5*s*r;
		return (area);
	}
	
}

public class TestAbstract

{
	public static void main(String args[]) {
		Circle ob = new Circle(4.8);
		Figure ob1=new Triangle(8.5,3.5);
		System.out.println("Area of Circle=  " + ob.calArea());
		System.out.println("Area of Triangle=  " + ob1.calArea());
	}
}