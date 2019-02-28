package polymorphism;

class Room {
	double a, b, area;

	Room(double p, double q) {
		a = p;
		b = q;
	}

	public void calArea() {
		area = a * b;
	}

	void show() {
		System.out.println("Area=" + area);
	}
}

class Bedroom extends Room {
	double c, vol;

	Bedroom(double m, double n, double r) {
		super(m, n);
		c = r;
	}

	void calVolume() {
		vol = c*a*b;
	}

	void show() {						//overriding the method of parent class 
		System.out.println("Volume=" + vol);
	}
}

public class MethodOverriding

{
	public static void main(String args[]) {
		Room ob = new Room(6.7, 8.67);				//parent class object
		Bedroom ob1 = new Bedroom(6.7, 8.67, 7.90);  //subclass object
		ob.calArea();
		ob.show();
		ob1.calVolume();
		ob1.show();                     //overriding the show method of room class
	}
}
