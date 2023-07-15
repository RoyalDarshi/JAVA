import java.util.Scanner;
class  Average1
{
	float avg(int x, int y)
	{
	float result= (float)(x+y)/2;
	return result;
	}
	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("ENTER THE VALUE OF X=");
			int a=s.nextInt();
			System.out.println("ENTER THE VALUE OF Y=");
			int b=s.nextInt();
			Average1 ob= new Average1();
			float rest=ob.avg(a,b);
			System.out.println("ENTER THE VALUE OF X="+a);
			System.out.println("ENTER THE VALUE OF Y="+b);
			System.out.println("average="+rest);
		}
	}
}
