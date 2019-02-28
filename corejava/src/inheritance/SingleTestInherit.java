package inheritance;

class Room {
	double a, b, area;

	Room(double p, double q) {
		a = p;
		b = q;
	}

	void calArea()

	{
		area = a * b;
	}

	void showarea() {
		System.out.println(area);
	}
}

class Bedroom extends Room // inheriting the parent class room
{
	double c, vol;

	Bedroom(double m, double n, double r) {
		super(m, n); // referring parent class object
		c = r;
	}

	void calVolume() {

		vol = c * area;
	}

	void showvolume() {
		System.out.println(vol);
	}
}

public class SingleTestInherit {
	public static void main(String args[]) {
		Bedroom ob = new Bedroom(6.7, 8.67, 7.90);
		ob.calArea();
		ob.calVolume();
		ob.showarea();
		ob.showvolume();
	}
}