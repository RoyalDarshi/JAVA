class Practice2
{
	int add(int arr[])
	{
		int c=0;
		for(int b:arr)
		{
			c=c+b;
		}
		return c;
	}
	public static void main(String[] args) 
	{
		Practice2 p=new Practice2();
		int brr[]={1,4,16,64,256,1024};
		int a=p.add(brr);
		System.out.println(a);
	}
}
