class Practice3 
{
	void show(char arr[])
		{
			int i=0;
			for(char c:arr)
			{
				c=arr[i];
				System.out.print(c);
				if(i==10)
					System.out.println();
				i++;
			}
		}
	public static void main(String[] args) 
	{
		Practice3 p=new Practice3();
		char brr[]={'P','R','I','Y','A','D','A','R','S','H','I','R','O','Y'};
		p.show(brr);
	}
}
