class Prime2 
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=100;
		for(;a<=b;a++)
		{
			boolean k=true;
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					k=false;
					break;
				}
			}
			if(k==true)
				System.out.println(a);
		}
	}
}
