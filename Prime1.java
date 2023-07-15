class Prime1 
{
	public static void main(String[] args) 
	{
		int a=89;
			boolean c=true;
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					c=false;
					break;
				}
			}
			if(c==true)
				System.out.println("Number is prime number");
			else
				System.out.println("Number is not prime number");
	}
}
