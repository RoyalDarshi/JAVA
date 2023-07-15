import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			int a=s.nextInt();
			int temp=a;
			int c=0;
			if(a>0)
			{
				while(a>0)
				{
					int b=a%10;
					a=a/10;
					c=c*10+b;
				}
			}
			else
				System.out.println("Wrong Number...");
			if(c==temp)
				System.out.println("Number is Palindrome ");
			else
				System.out.println("Number is not Palindrome ");
		}
	}//End_of_main
}
