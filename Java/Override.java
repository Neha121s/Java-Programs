class Shape 
{
	public void area()
	{
	}
}
class Circle extends Shape
{
	void area(int r)
	{
		System.out.println("Area of circle is:- "+r*r*3.15);
	}
}
class Triangle extends Shape
{
	void area(int l,int b)
	{
		System.out.println("Area of traingle is:- "+0.5*l*b);
	}
}
class Override
{
	public static void main(String args[])
	{
		Circle c1=new Circle();
		c1.area(5);
		Triangle t1=new Triangle();
		t1.area(10,20);
	}
}
	