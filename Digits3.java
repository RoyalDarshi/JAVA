public class Digits3
{
	public static void main(String[] args) 
	{
		int a=1234;
		int rev=0;
		while(a!=0)
		{
			int b=a%10;
			a=a/10;
			rev=rev*10;
			rev=rev+b;
		}
		System.out.println(rev);
	}
}
