import java.util.Scanner;
class Digits
{
	public static void main(String[] args) 
	{
		int a,b;
		System.out.println("Enter two digit number:");
		try (Scanner s = new Scanner(System.in)) {
			a=s.nextInt();
		}
		if(a>=10&&a<=99)
		{
			b=a%10;
			a=a/10;
			if(a==0)
				System.out.println("Zero");
			else if(a==1)
				System.out.println("One");
            else if(a==2)
				System.out.println("Two");
			else if(a==3)
				System.out.println("Three");
			else if(a==4)
				System.out.println("Four");
			else if(a==5)
				System.out.println("Five");
			else if(a==6)
				System.out.println("Six");
			else if(a==7)
				System.out.println("Seven");
			else if(a==8)
				System.out.println("Eight");
			else 
				System.out.println("Nine");
			if(b==0)
				System.out.println("Zero");
			else if(b==1)
				System.out.println("One");
			else if(b==2)
				System.out.println("Two");
			else if(b==3)
				System.out.println("Three");
			else if(b==4)
				System.out.println("Four");
			else if(b==5)
				System.out.println("Five");
			else if(b==6)
				System.out.println("Six");
			else if(b==7)
				System.out.println("Seven");
			else if(b==8)
				System.out.println("Eight");
			else
				System.out.println("Nine");
		}
		else
			System.out.println("Kripya Aukaat Mein Reh Kar Type Karen!!!");
	}
}
