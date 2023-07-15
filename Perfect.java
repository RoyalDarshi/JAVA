class Perfect 
{
	public static void main(String[] args) 
	{
		int a=24;
		int sum=0;
		for (int i=1;i<a;i++)
		{
			sum=sum+i;
		}
		if(sum==a)
			System.out.println("Number is perfect Number");
		else
			System.out.println("Number is not perfect Number");

	}
}
