package firstproject;
import java.io.DataInputStream;
class vj
{
	public static void  main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int l,b,a;
		try
		{
			System.out.println("enter a number");
			l=Integer.parseInt(in.readLine());
			b=Integer.parseInt(in.readLine());
			a=l*b;
			System.out.println("Area of rectangle is"+a);
		}
		catch(Exception X)
		{
		}
	}
		}

