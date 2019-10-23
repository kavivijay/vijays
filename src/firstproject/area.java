package firstproject;
import java.io.DataInputStream;
class area
{
	public static void  main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int a,b,c,d;
		try
		{
			System.out.println("Enter three number(for multiplication) :");
			a=Integer.parseInt(in.readLine());
			b=Integer.parseInt(in.readLine());
			c=Integer.parseInt(in.readLine());
			d=a*b*c;
			System.out.println("Product is the "+d);
		}
	catch(Exception X)
		{
		}
	}
		}
