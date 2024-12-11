package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DBCon_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;)
		{
			String myName=sc.nextLine();
			System.out.println("Enter myName:");
			long phno=Long.parseLong(sc.nextLine());
			System.out.println("enter phno:");
			String gMail=sc.nextLine();
			System.out.println("enter gmail:");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","kanna");
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("insert into MYDETAILS values('"+myName+"',"+phno+",'"+gMail+"')");
			System.out.println("The value in k:"+k);
			if(k>0)
			{
				System.out.println("myDeatails inserted sucessfully");
			}
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}

}
