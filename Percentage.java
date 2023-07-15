import java.util.Scanner;
class Percentage 
{
	float calculate(int totalmarks)
	{
		float percentage= (float)totalmarks/6;
		return percentage;
	}
	public static void main(String[] args) 
	{
		try (Scanner S = new Scanner(System.in)) {
			System.out.println("number in s1=");
			int s1=S.nextInt();
			System.out.println("number in s2=");
			int s2=S.nextInt();
			System.out.println("number in s3=");
			int s3=S.nextInt();
			System.out.println("number in s4=");
			int s4=S.nextInt();
			System.out.println("number in s5=");
			int s5=S.nextInt();
			System.out.println("number in s6=");
			int s6=S.nextInt();
			int totmarks= s1+s2+s3+s4+s5+s6;
			Percentage ob= new Percentage();
			float per=ob.calculate(totmarks);
			System.out.println("NUMBER IN S1="+s1);
			System.out.println("NUMBER IN S2="+s2);
			System.out.println("NUMBER IN S3="+s3);
			System.out.println("NUMBER IN S4="+s4);
			System.out.println("NUMBER IN S5="+s5);
			System.out.println("NUMBER IN S6="+s6);
			System.out.println("TOTALMARKS IN SUBJECTS="+totmarks);
			System.out.println("PERCENTAGE="+per);
		}
	}
}
