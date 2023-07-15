import java.util.Scanner;
class  Add
{
	public static void main(String[] args) 
	{
		Scanner S= new Scanner(System.in);
		System.out.println("VALUE OF a=");
		int a=S.nextInt();
		System.out.println("VALUE OF b=");
		int b=S.nextInt();
		System.out.println("VALUE OF f=");
		int f=S.nextInt();
		System.out.println("VALUE OF g=");
		int g=S.nextInt();
		System.out.println("VALUE OF p=");
		int p=S.nextInt();
		System.out.println("VALUE OF r=");
		int r=S.nextInt();
		System.out.println("VALUE OF q=");
		int q=S.nextInt();
		int d=f*g+a-b;
		int k=p+d+r*q;
		System.out.println("VALUE OF d="+d);
		System.out.println("VALUE OF K="+k);
	}
}
