class Digits2 
{
	public static void main(String[] args) 
	{
		int a=234;
		while(a!=0)
		{
			int b=a%10;
			System.out.println(b);
			a=a/10;
		}
	}
}
