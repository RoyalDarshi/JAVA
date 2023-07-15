import java.util.Scanner;

class ResultAdv {
	Scanner scn = new Scanner(System.in);
	String name;
	String branch;
	String roll;
	boolean fail;
	int totM;
	String grade;

	void calculate(int totMark, boolean f1) {
		float per = (float) totMark / 6;
		if (f1 == true) {
			grade = "Fail";
		} else if (per >= 70) {
			grade = "Destinction";
		} else if (per >= 60 && per < 70) {
			grade = "1st Class";
		} else if (per >= 50 && per < 60) {
			grade = "2nd Class";
		} else {
			grade = "3rd Class";
		}
	}//calculate

	boolean checkBranch(String branch1) {
		boolean k = false;

		String a = "CSE";
		String b = "ECE";
		String c = "EEE";
		if (branch1.equals(a) || branch1.equals(b) || branch1.equals(c)) {
			k = true;
		}
		return k;
	}//checkBranch

	void getResult() {
		System.out.println("Enter your Name:");
		name = scn.nextLine();
		System.out.println("Enter your Branch:");
		branch = scn.nextLine();
		boolean isBranch = checkBranch(branch);
		if (isBranch) {
			System.out.println("Enter your rollno:");
			roll = scn.nextLine();
			totM = 0;
			int p;
			fail = false;
			for (int n = 1; n <= 6; n++) {
				System.out.println("Enter marks of subject s" + n + ":");
				p = scn.nextInt();
				if (p >= 0 && p <= 100) {
					totM = totM + p;
				} else {
					System.out.println("Please enter valid marks!");
					n--;
				}
				if (p >= 0 && p < 34)
					fail = true;
			} // end of loop
			calculate(totM, fail);
		} else {
			System.out.println("Invalid Branch!");
		}
	}// getResult

	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("\nName: " + name + "\n");
		sBuilder.append("Branch: " + branch + "\n");
		sBuilder.append("Rollno: " + roll + "\n");
		sBuilder.append("Grade: " + grade + "\n");
		sBuilder.append("Total Marks: " + totM + "\n");
		sBuilder.append("Percentage: " + totM / 6 + "\n");
		return sBuilder.toString();
	}// toString

	public static void main(String[] args) {
		ResultAdv result1 = new ResultAdv();
		result1.getResult();
		System.out.println(result1);
	}// main
}// end of class
