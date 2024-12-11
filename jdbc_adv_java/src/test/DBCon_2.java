package test;

import java.util.*;
import java.sql.*;

public class DBCon_2 {
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;)
		{
			System.out.println("enter the cust_phno:");
			long phno=Long.parseLong(sc.nextLine());
			System.out.println("enter the cust_name:");
			String cName=sc.nextLine();
			System.out.println("enter cust_city:");
			String ccity=sc.nextLine();
			System.out.println("enter the cust_mid");
			String cMid=sc.nextLine();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","kanna");
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("insert into customer67 values("+phno+",'"+cName+"','"+ccity+"','"+cMid+"')");
			System.out.println("the value in k:"+k);
			if(k>0)
			{
				System.out.println("customer details inserted successfully...");
				con.close();
			}
		}
		catch(Exception e)
		{
		System.out.println(e.toString());
	}

}
}
