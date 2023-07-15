import java.util.Scanner;
class Result
{
	float calculate(int totMark)
	{
		float per=(float)totMark/6;
		return per;
	}
	public static void main(String[] args) 
	{
		int s1,s2,s3,s4,s5,s6;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter Subject Marks:");
			s1=s.nextInt();
			s2=s.nextInt();
			s3=s.nextInt();
			s4=s.nextInt();
			s5=s.nextInt();
			s6=s.nextInt();
		}
		int total=s1+s2+s3+s4+s5+s6;
		Result re = new Result();
		float percentage=re.calculate(total);
		System.out.println("Marks in s1 = "+s1);
		System.out.println("Marks in s2 = "+s2);
		System.out.println("Marks in s3 = "+s3);
		System.out.println("Marks in s4 = "+s4);
		System.out.println("Marks in s5 = "+s5);
		System.out.println("Marks in s6 = "+s6);
		System.out.println("Total Marks = "+total);
		System.out.println("Percentage = "+percentage);
	}
}
