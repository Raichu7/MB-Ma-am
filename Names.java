import java.io.*;
import java.util.*;
public class Names
{
	
	public static void main(String args[])throws IOException
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw=new FileWriter("abc.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			String s;
			String names [] = new String[100];
			int k=0;
			while(!(s=br.readLine()).equals("$$$"))
			{
				names[k]=s;
				bw.write(s);
				k++;
				bw.write("\r\n");
			}
			bw.close();
			fw.close();
			//Arrays.sort(names);
			for(int i=0;i<k;i++)
			{
				for(int j=0;j<k-i-1;j++)
				{
					if((names[j].compareTo(names[j+1]))<0)
					{
						String temp=names[j];
						names[j]=names[j+1];
						names[j+1]=temp;
					}
				}
			}
			for(int i=0;i<k;i++)
			{
				System.out.println(names[i]);
			}
			FileWriter fw1 = new FileWriter("xyz1.txt");
			BufferedWriter bw1 = new BufferedWriter(fw1);
			int i=0;
			while(i<k)
			{
				bw1.write(names[i]);
				i++;
				bw1.write("\r\n");
			}
			bw1.close();
			fw1.close();
		}
		catch(Exception e)
		{}
	}
}
