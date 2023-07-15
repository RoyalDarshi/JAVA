import java.util.Scanner;
class Sampat
{
	float Average(int x,int y)
	{
		float z=(float)(x+y)/2;
		return z;
	}
	public static void main(String[] args)
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter two value:");
			int a=s.nextInt();
			int b=s.nextInt();
			Sampat sp=new Sampat();
			float c=sp.Average(a,b);
			System.out.println("Average of "+a+" and "+b+" is:"+c);
		}
	}
}
