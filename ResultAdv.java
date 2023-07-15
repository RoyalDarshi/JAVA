import java.util.Scanner;
class StudentResult
{
	void calculate(int totMark,boolean f1)
	{
		float per=(float)totMark/6;
		System.out.println("Total Marks:"+totMark);
		System.out.println("Percentage:"+per);
		if(f1==true)
			System.out.println("Fail");
		else if(per>=70)
			System.out.println("Destinction");
		else if(per>=60&&per<70)
			System.out.println("1st Class");
		else if(per>=50&&per<60)
			System.out.println("2nd Class");
		else if(per>=35&&per<50)
			System.out.println("3rd Class");
	}
}
class checkBranch
{
	boolean checkB(String branch1)
	{
		boolean k=false;
	
	    String a="CSE";
		String b="ECE";
		String c="EEE";
		if(branch1.equals(a)||branch1.equals(b)||branch1.equals(c))
		{
			k=true;
	    }
			return k;
	}
}//End of class
class ResultAdv 
{
	String name;
	String branch;
	String roll;
	boolean fail;
	int totM;
	void getResult() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter your Name:");
			name = s.nextLine();
			System.out.println("Enter your Branch:");
			branch = s.nextLine();
			checkBranch cb = new checkBranch();
			boolean j = cb.checkB(branch);
			if (j == true) {
				System.out.println("Enter your rollno:");
				roll = s.nextLine();
				totM = 0;
				int p;
				fail = false;
				for (int n = 1; n <= 6; n++) {
					System.out.println("Enter marks of subject s" + n + ":");
					p = s.nextInt();
					if (p >= 0 && p <= 100) {
						totM = totM + p;
					} else {
						System.out.println("Please enter valid marks!");
						n--;
					}
					if (p >= 0 && p < 34)
						fail = true;
				} //end of loop
				StudentResult sr = new StudentResult();
				sr.calculate(totM, fail);
			} else {
				System.out.println("Invalid Branch!");
			}
		}
	}
	public static void main(String[] args) 
	{				
		ResultAdv result1 = new ResultAdv();
		result1.getResult();
		System.out.println(result1);
		ResultAdv result2 = new ResultAdv();
		result2.getResult();
		System.out.println(result2);	
	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("Name: " + name + "\n");
		sBuilder.append("Branch: " + branch + "\n");
		sBuilder.append("Rollno: " + roll + "\n");
		sBuilder.append("Total Marks: " + totM + "\n");
		sBuilder.append("Percentage: " + totM/6 + "\n");
		sBuilder.append("Fail: " + fail + "\n");
		
		return sBuilder.toString();
	}
}//end of class
