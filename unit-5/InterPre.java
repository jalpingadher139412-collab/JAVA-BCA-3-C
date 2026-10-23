import java.sql.*;
import java.util.*;

class InterPre
{
	public static void main(String args[])
	{
		
		try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");

String sql = "INSERT INTO stud (grno, name) VALUES (?, ?)";
PreparedStatement pstmt = cn.prepareStatement(sql);

Scanner sc = new Scanner(System.in);
			int grno = 0;
			String name="";
			System.out.println("Enter grno.");
			grno=sc.nextInt();
			System.out.println("Enter name");
			name=sc.next();

pstmt.setInt(1, grno);
pstmt.setString(2, name);

int x = pstmt.executeUpdate();
System.out.println("Number of rows inserted: " + x);

cn.close();
		}
catch (Exception e)
{
System.out.println("Exception:" + e);
}
	}
}	