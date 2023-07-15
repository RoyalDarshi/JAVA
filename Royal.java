import java.util.Scanner;
class Royal
{
	float avg(int x,int y) 
	{
		 float z =(float)(x+y)/2;
		 return z;
	}
	public static void main(String[] args)
	{
		try (Scanner ds = new Scanner(System.in)) {
			System.out.println(" enter value a and b");


			int a=ds.nextInt();
			int b=ds.nextInt();
			Royal ac=new Royal();
			float results=ac.avg(a,b);
			System.out.println("the avg of two values"+results);
		}
	}
}