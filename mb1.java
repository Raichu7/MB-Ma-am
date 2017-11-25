import java.io.*;
class Staff
{
	String name;
	int code;
	Staff(String n,int c)
	{
		name=n;
		code=c;
	}
	public void display()
	{
		System.out.println("Name is"+name);
		System.out.println("Code is"+code);
	}
}
class Officer extends Staff
{
	String grade;
	Officer(String n,int c,String g)
	{
		super(n,c);
		grade=g;
	}
	public void display()
	{
		super.display();
		System.out.println("Grade is"+grade);
	}
}
class Teacher extends Staff
{
	String subject;
	Teacher(String n,int c,String s)
	{
		super(n,c);
		subject=s;
	}
	public void display()
	{
		super.display();
		System.out.println("Subject is"+subject);
	}
}
class Typist extends Staff
{
	int speed;
	Typist(String n,int c,int a)
	{
		super(n,c);
		speed = a;
	}
	public void display()
	{
		super.display();
		System.out.println("Speed is"+speed);
	}
}
class CasualTypist extends Typist
{
	int dailywages;
	CasualTypist(String n,int c,int s,int d)
	{
		super(n,c,s);
		dailywages=d;
	}
	public void display()
	{
		super.display();
		System.out.println("Daily wages is"+dailywages);
	}
}
class RegularTypist extends Typist
{
	int remuneration;
	RegularTypist(String n,int c,int s,int r)
	{
		super(n,c,s);
		remuneration=r;
	}
	public void display()
	{
		super.display();
		System.out.println("Remuneration"+remuneration);
	}
}
class mb1
{
	public static void main(String args[])throws IOException
	{
		Staff s[] = new Staff[4];
		s[0]= new Officer("Ankur_officer",1,"A");
		s[0].display();
		s[1]=new Teacher("Jamit_teacher",2,"CSE");
		s[1].display();
		s[2]=new CasualTypist("Pranjal_CasualTypist",3,50,100);
		s[2].display();
		s[3]=new RegularTypist("Prabhar_RegularTypist",4,100,101);
		s[3].display();
	}
}