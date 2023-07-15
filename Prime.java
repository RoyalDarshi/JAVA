class Prime 
{
	public static void main(String[] args) 
	{
		int a=2;
		int j=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
				j++;
		}
		if(j==2)
			System.out.println("Number is Prime Number");
		else
			System.out.println("Number is not Prime Number");
	}
}
