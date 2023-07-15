import java.util.Scanner;
class Average
{
	float Ave(int x,int y)
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
			Average av=new Average();
			float c=av.Ave(a,b);
			System.out.println("Average of "+a+" and "+b+" is:"+c);
		}
	}
}
