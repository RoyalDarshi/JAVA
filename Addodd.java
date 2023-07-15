import java.util.Scanner;
class Addodd 
{
	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the number:");
			int a=s.nextInt();
			int	temp=a;
			int sum=0;
			if(a>0)
			{
				while(a>0)
				{
					if(a%2!=0)
					{
					sum=sum+a;
					a--;
					}
					else
					a--;
				}//End_of_While
			System.out.println("Sum of odd number till "+temp+"="+sum);
			}
			else
				System.out.println("Wrong Number...");
		}
	}
}
