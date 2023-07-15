class  Assignment1
{
	float calculate(int totMarks)
	{
	    float per=(float)(totMarks)/6;
		return per;
	}

	public static void main(String[] args) 
	{
		int s1=76,s2=78,s3=46,s4=65,s5=54,s6=86;
		int subTot=(s1+s2+s3+s4+s5+s6);
		Assignment1 ob=new Assignment1();
		float percentage=ob.calculate(subTot);
		System.out.println("Marks in subject S1:"+s1);
		System.out.println("Marks in subject S1:"+s2);
		System.out.println("Marks in subject S1:"+s3);
		System.out.println("Marks in subject S1:"+s4);
		System.out.println("Marks in subject S1:"+s5);
		System.out.println("Marks in subject S1:"+s6);
		System.out.println("Total marks got:"+subTot);
		System.out.println("Total percentage got:"+percentage);
	}
}
