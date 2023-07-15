import java.util.Scanner;
class Add
{
 int addition(int a, int b)
	{
	 int result=a+b;
	 return result;
	}
}
class Substract
{
	int substraction(int a, int b)
	{
		int result=a-b;
		return result;
	}
}
class Multiply
{
	int multiplication(int a, int b)
	{
		int result=a*b;
		return result;
	}
}
class Divide
{
	int division(int a, int b)
	{
		int result=a/b;
		return result;
	}
}
class Moddivision
{
	int moddivision(int a, int b)
	{
		int result=a%b;
		return result;
	}
}
class Lalit
{
	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("====RESULT====");
			System.out.println("ENTER THE VALUE OF X:");
			int x=s.nextInt();
			System.out.println("ENTER THE VALUE OF Y:");
			int y=s.nextInt();
			System.out.println("====CONDITION====");
			System.out.println("1.ADDITION\n2.SUBSTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODDIVISION");
			System.out.println("enter the choice;");
			int choice=s.nextInt();
			switch(choice)
			{

			case 1:

			Add ad=new Add();
			int r1=ad.addition(x,y);
			System.out.println("result :"+r1);
			break;

			case 2:

			Substract st = new Substract();
			int r2=st.substraction(x,y);
			System.out.println("result :"+r2);
			break;

			case 3:
			Multiply mp = new Multiply();
			int r3=mp.multiplication(x,y);
			System.out.println("result:"+r3);
			break;

			case 4:
			Divide dd = new Divide();
			int r4=dd.division(x,y);
			System.out.println("result;"+r4);
			break;

			case 5:
			Moddivision md = new Moddivision();
			int r5=md.moddivision(x,y);
			System.out.println("result:"+r5);
			break;
			default:
				System.out.println("invzlid choice....");
			}
		}
		
	}
}
