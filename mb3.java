import java.io.*;
public interface Area
{
	double calcArea(double radius);
	double caclArea(double length,double breadth);
}
class Calculate implements Area
{
	double calcArea(double r)
	{
		return 3.14*r*r;
	}
	double calcArea(double l,double b)
	{
		return l*b;
	}
}
class mb3 
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader in = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(in);
		Calculate c1 = new Calculate();
		System.out.println(c1.caclArea(7.0));
		System.out.println(c1.caclArea(7.0,10.0));
	}
}
	