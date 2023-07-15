import java.util.Scanner;
class CheckPin
{
	int checkpin(int pin)
	{
	if(pin==1111||pin==2222||pin==3333)
		return 1;
	else
		return 0;
	}
}
class Deposit
{
	
		void deposit(int a,int k)
		{
			k=k+a;
			System.out.println("Amt. deposited:"+a);
			System.out.println("Balance amt:"+k);
			System.out.println("$$$$Transaction Completed$$$$");
		}
}
class Withdraw
{
	
		void wdaw(int e,int i)
		{
			if(e<=i)
			{
				i=i-e;
				System.out.println("Amt. Withdrawn:"+e);
				System.out.println("Balance amt:"+i);
				System.out.println("$$$$Transaction Completed$$$$");
			}
			else
				System.out.println("****Insufficient Balance...****");
		}
}
class Balance
{
	int balance()
	{
	int bal;
	bal=2000;
	return bal;
	}
}
class Bank 
{
	public static void main(String[] args) 
	{
		System.out.println("====Welcome to Banking System====");
		System.out.println("Enter your Pin Number:");
		try (Scanner s = new Scanner(System.in)) {
			int cp=s.nextInt();
			CheckPin pc=new CheckPin();
			int a1=pc.checkpin(cp);
			if(a1==1)
			{
				Balance bd=new Balance();
				System.out.println("Enter the Choice:");
				System.out.println("1.Withdraw:\n2.Deposit:");
				int choice=s.nextInt();
				switch (choice)
				{
				case 1:
					System.out.println("Enter the Amount:");
			        int b=s.nextInt();
			        if(b>0&&b%100==0)
					{
					Withdraw wd=new Withdraw();
					int h=bd.balance();
					wd.wdaw(b,h);
					}
					else
					System.out.println("****Invalid Amount...****");
					break;
				case 2:
					System.out.println("Enter the Amount:");
					int f=s.nextInt();
			        if(f>0&&f%100==0)
					{
						Deposit dp=new Deposit();
						int g=bd.balance();
						dp.deposit(f,g);
					}
					else
					System.out.println("****Invalid Amount...*****");
					break;
					default:
						System.out.println("****Wrong choice...****");
				}
			}
			else
				System.out.println("****Invalid Pin...****");
		}
	}
}
