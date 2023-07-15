import java.util.Scanner;
class Customer
{
	String custName;
	long custAccno;
	float custBalance;
	void setCustomer(String a,long b,float c)
	{
		custName=a;
		custAccno=b;
		custBalance=c;
	}
	void getCustomer()
	{
		System.out.println("=======Customer Details ======");
		System.out.println("Customer Name is:"+custName);
		System.out.println("Customer Account No. is:"+custAccno);
		System.out.println("Customer Balance is:"+custBalance);
	}
}
class DemoMethods5 
{
	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter Customer Name:");
			String cName=s.nextLine();
			System.out.println("Enter customer Acc. No.:");
			long cAccno=s.nextLong();
			System.out.println("Enter customer Balance:");
			float cBalance=s.nextFloat();
			Customer sc=new Customer();
			sc.setCustomer(cName,cAccno,cBalance);
			sc.getCustomer();
		}
	}
}
