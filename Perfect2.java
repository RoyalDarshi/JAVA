class Perfect2 
{
	public static void main(String[] args) 
	{
		int a=50;
		int b=50000;
		for(;a<=b;a++)
		{
			int sum=0;
			for(int i=1;i<a;i++)
			{
				if(a%i==0)
					sum=sum+i;
			}
			if(sum==a)
				System.out.println(a);
		}
	}
}
