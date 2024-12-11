package test;

import java.sql.*;

public class DBCon_3 {

	public static void main(String[] args) {
		try
		{
		//step 1 loading driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step 2 creating connection
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","kanna");
		//	statement 3 preparing jdbc stmt
			Statement stm=con.createStatement();
			//step 4 update query
			ResultSet rs=stm.executeQuery("select * from BookDetails67");
			System.out.println("..........BookDetails67......");
			while(rs.next())
			{
				System.out.println(rs.getLong(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			}//END OF LOOP
			//STEP-5  CLOSING CONNECTION
			con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

}
}