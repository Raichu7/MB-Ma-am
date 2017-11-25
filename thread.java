import java.io.*;
class MyThread implements Runnable
{
	String tname;
	MyThread(String name)
	{
		tname = name;
	}
	static int j = 1;
	public void run()
	{
		//int j;
		try
		{
			for(int i=1;i<=10;i++)
			{
				int c=0;
				for(int k=1;k<=j;k++)
				{
					if(j%k==0)
					{
						c++;
					}
				}
				if(c==2)
				{
					System.out.println(tname+" : "+j);
				}
				++j;
			}
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
	}
}
public class thread
{
	public static void main(String args[])throws IOException
	{
		MyThread m1 = new MyThread("m1");
		MyThread m2 = new MyThread("m2");
		MyThread m3 = new MyThread("m3");
		MyThread m4 = new MyThread("m4");
		MyThread m5 = new MyThread("m5");
		MyThread m6 = new MyThread("m6");
		MyThread m7 = new MyThread("m7");
		MyThread m8 = new MyThread("m8");
		MyThread m9 = new MyThread("m9");
		MyThread m10 = new MyThread("m10");
		Thread t1  = new Thread(m1);
		Thread t2  = new Thread(m2);
		Thread t3  = new Thread(m3);
		Thread t4  = new Thread(m4);
		Thread t5  = new Thread(m5);
		Thread t6  = new Thread(m6);
		Thread t7  = new Thread(m7);
		Thread t8  = new Thread(m8);
		Thread t9  = new Thread(m9);
		Thread t10  = new Thread(m10);
		try
		{
			t1.start();
			t1.sleep(200);
			t2.start();
			t2.sleep(200);
			t3.start();
			t3.sleep(200);
			t4.start();
			t4.sleep(200);
			t5.start();
			t5.sleep(200);
			t6.start();
			t6.sleep(200);
			t7.start();
			t7.sleep(200);
			t8.start();
			t8.sleep(200);
			t9.start();
			t9.sleep(200);
			t10.start();
			t10.sleep(200);
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
	}
}