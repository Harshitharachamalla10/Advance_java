package test;

import java.sql.*;
import java.util.Scanner;

public class DBCon_4
{
	public static void main(String[] args)  
	{
		Scanner sc=new Scanner(System.in);
		try(sc;)
		{
		System.out.println("enter the customer details to display cust_phno");
				long phno=sc.nextLong();
		{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:5121:xe","system","kanna");
				Statement stm=con.createStatement();
				ResultSet rs=stm.executeQuery("select * from customer67 where phno="+phno+"");
				if(rs.next())
				{
				System.out.println(rs.getLong(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
				
				}
				else
				{
					System.out.println("invalid phno");
				}
			
		}
		}
		
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}

	
		

