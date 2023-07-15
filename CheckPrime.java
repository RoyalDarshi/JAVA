class CheckPrime 
{
	public static void main(String[] args) 
	{
		boolean k=false;
		int a=1;
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				k=true;
				break;
			}
		}
		
		if(k==true)
			System.out.println("No is not Prime");
		else
			System.out.println("No is Prime");
	}
}
