package inheritance;

class Volume {
	double l, b, h, vol;

	Volume(double p, double q, double r) // constructor
	{
		l = p;
		b = q;
		h = r;
	}

	void calVolume() {
		vol = l * b * h;
	}

	void showVolume() {
		System.out.println(vol);
	}
}

class Weight extends Volume // first level of inheritance
{
	double w;

	Weight(double a, double b, double c, double d) {
		super(a, b, c); // referring the parent class objects
		w = d;

	}

	void calWeight() {
		System.out.println(w);
	}
}

class Shipment extends Weight {
	double cost;

	Shipment(double p, double q, double r, double s, double t) {
		super(p, q, r, s);
		cost = t;
	}

	void calCost() {
		System.out.println(cost);

	}
}

public class TestMultilevel {
	public static void main(String args[]) {
		Shipment ob = new Shipment(7.6, 9.3, 5.5, 678.5, 469.78);
		ob.calVolume();
		ob.showVolume();
		ob.calWeight();
		ob.calCost();
	}
}
