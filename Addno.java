import java.util.Scanner;
class Addno 
{
	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Number:");
			int n=s.nextInt();
			int sum=0;
			if(n>0)
			{
				while(n>0)
				{
					if(n%3!=0)
					{
						sum=sum+n;
						n--;
					}
					else
						n--;
				}
				System.out.println("Sum of Numbers are:"+sum);
			}//End_of_if
			else
				System.out.println("Wrong Number...");
		}
	}
}
