class Digits1 
{
	public static void main(String[] args) 
	{
		int a=98985;
		int sum=0;
		while(a!=0)
		{
			int b=a%10;
			sum=sum+b;
			a=a/10;
		}
		System.out.println(sum);
	}
}
