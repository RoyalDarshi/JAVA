import java.util.Scanner;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=s.nextInt();
		int temp=a;
		int c=0;
		if(a>0)
		{
			while(a>0)
			{
				int b=a%10;
				a=a/10;
				c=c+b*b*b;
			}
		}
		else
		System.out.println("Wrong Input!");
		if(temp==c)
		System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not Armstrong");
		s.close();
	}
}
