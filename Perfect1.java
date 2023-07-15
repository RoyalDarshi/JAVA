class Perfect1 
{
	public static void main(String[] args) 
	{
		int a=1000;
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				sum=sum+j;
			}
			if(sum==i)
				System.out.println(sum);
		}
	}
}
