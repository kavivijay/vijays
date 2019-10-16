import java.io.DataInputStream;
class Sundar
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int a;
		try
		{
			System.out.println("enter a number");
			a=Integer.parseInt(in.readLine());
			if(a%4==0)
			{
				System.out.println("Leap year");
			}
			else {
				System.out.println("Not leap year");
			}
		}
		catch(Exception x)
		{
			
		}
	}
}