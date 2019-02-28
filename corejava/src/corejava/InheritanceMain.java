package corejava;

class Box
{
	double len;
	double hight;
	double width;
	Box(Box ob)
	{
		len=ob.len;
		hight=ob.hight;
		width=ob.width;
	}
	Box(double a,double b,double c)
	{
		len=a;
		hight=b;
		width=c;
	}
	Box(double l)
	{
		len=hight=width=l;
	}
	double volume()
	{
		return (len*hight*width);
	}
}

class BoxWeight extends Box {

	double weight;
	BoxWeight(BoxWeight ob)
	{
		super(ob);
		weight=ob.weight;
	}
	BoxWeight(double a,double b,double c,double d)
	{
		super(a,b,c);
		weight=d;
	}
	BoxWeight(double p,double q)
	{
		super(p);
		weight=q;
	}
}

class Shipment extends BoxWeight
{
	double cost;
	Shipment(Shipment ob)
	{
		super(ob);
		cost=ob.cost;
	}
	Shipment(double p,double q,double r,double s,double t)
	{
		super(p,q,r,s);
		cost=t;
	}
	Shipment(double m,double n,double o)
	{
		super(m,n);
		cost=o;
	}
}

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shipment obj1=new Shipment(5,6,7,8,9);
		Shipment clone=new Shipment(obj1);
		double o1=clone.volume();
		System.out.println(o1);
		System.out.println();
		Shipment obj2=new Shipment(2,8,3);
		double o2=obj2.volume();
		System.out.println(o2);
		
	}
}
