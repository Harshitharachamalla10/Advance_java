package test;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBCon_1 {

	public static void main(String[] args) 
	{
		try {
			// step 1:loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//creating connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhhost:1521:xe","system","kanna");
		//preparing jdbc stmt
		Statement stm=con.createStatement();
		//executing query
		ResultSet rs=stm.executeQuery("select * from Customer67");
		System.out.println(".....Customer67 Details....");
		while(rs.next())
		{
			System.out.println(rs.getLong(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		}

}
