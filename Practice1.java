class Practice1 
{
	int[] number()
	{
		int arr[]={01,04,16,64,256,1024};
		return arr;
	}
	public static void main(String[] args) 
	{
		Practice1 p=new Practice1();
		int[] a=p.number();
		for(int b:a)
		{
			System.out.println(b);
		}
	}
}
