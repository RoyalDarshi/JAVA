import java.sql.*;
class Connection 
{
	public static void main(String[] args) 
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			System.out.println("connection established succesfully");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
