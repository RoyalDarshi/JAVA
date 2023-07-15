import java.util.Scanner;

class  Sumeven
{
	public static void main(String[] args) 
	{
		int sum;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the number");
			int n=s.nextInt();
			sum=0;
			for(int i = 2;i<=n;i++)
				if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("sum of even number: "+sum);
	}
}
