class Calculation 
{
float calculate(int totalmarks)
	{
	float percentage= (float)totalmarks/6;
		return percentage;
	}
public static void main(String[] args) 
	{
		int s1=50,s2=60,s3=70,s4=85,s5=95,s6=99;
		int total= s1+s2+s3+s4+s5+s6;
		Calculation ob = new Calculation();
		float s=ob.calculate(total);
		System.out.println("NUMBERS IN S1="+s1);
		System.out.println("NUMBERS IN S2="+s2);
		System.out.println("NUMBERS IN S3="+s3);
		System.out.println("NUMBERS IN S4="+s4);
		System.out.println("NUMBERS IN S5="+s5);
		System.out.println("NUMBERS IN S6="+s6);
		System.out.println("TOTALMARKS="+total);
		System.out.println("PERCENTAGE="+s);

	}
}
