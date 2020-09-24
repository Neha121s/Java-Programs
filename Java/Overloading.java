class Area
{
	
	int l,b,h,r;
	double area(int r)
	{
		return r*r*3.15;
	}
	double area(int l,int b)
	{
		return l*b;
	}
	double area(int l, int b, int h)
	{
		return 0.5*l*b*h;
	}
}
class Overloading
{
	public static void main(String args[])
	{
		Area a1=new Area();
		System.out.println("Area of Circle is:- "+a1.area(5));	
		System.out.println("Area of Rectangle is:- "+a1.area(5,6));
		System.out.println("Area of Triangle is:- "+a1.area(5,6,7));
	}
}