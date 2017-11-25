import java.io.*;
abstract class Shape
{
	String name;
	Shape(String n)
	{
		name=n;
	}
	public abstract void display();
}
class Cube extends Shape
{
	double side;
	Cube(String n,double s)
	{
		super(n);
		side=s;
	}
	double calcArea()
	{
		return 6*side*side;
	}
	double calcVol()
	{
		return side*side*side;
	}
	public void display()
	{
		System.out.println("Name is"+name);
		System.out.println("Area is"+calcArea());
		System.out.println("Volume is"+calcVol());	
	}
}
class Cone extends Shape
{
	double radius;
	double height;
	Cone(String s,double r,double h)
	{
		super(s);
		radius=r;
		height=h;
	}
	double calcArea()
	{
		return 3.14*radius*(radius+Math.sqrt(height*height+radius*radius));
	}
	double calcVol()
	{
		return (3.14*radius*radius*height)/3;
	}
	public void display()
	{
		System.out.println("Name is"+name);
		System.out.println("Area is"+calcArea());
		System.out.println("Volume is"+calcVol());	
	}
}
class mb2
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		int n;
		System.out.println("Enter the number of elements ");
		n = Integer.parseInt(br.readLine());
		Shape s1[] = new Shape[n];
		int choice;
		int j=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("1. For Cube");
			System.out.println("2. For Cone");
			choice = Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1:
					System.out.println("Enter the side");
					double s = Double.parseDouble(br.readLine());
					s1[j] = new Cube("Cube",s);
					/*s1[j].calcArea();
					s1[j].calcVol();*/
					s1[j].display();
					j++;
					break;
				case 2:
					System.out.println("Enter the radius");
					double r = Double.parseDouble(br.readLine());
					System.out.println("Enter the height");
					double h = Double.parseDouble(br.readLine());
					s1[j]=new Cone("Cone",r,h);
					/*s1[j].calcArea();
					s1[j].calcVol();*/
					s1[j].display();
					j++;
					break;
				default:
					System.out.println("Wrong input");
			}
		}
	}
}