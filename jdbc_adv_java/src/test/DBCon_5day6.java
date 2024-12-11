package test;


import java.sql.*;
import java.sql.*;
import java.util.*;

public class DBCon_5day6
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;)
		{
		Class.forName("oracle.jdbc.driver.oracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","kanna");
		PreparedStatement ps1=con.prepareStatement("insert into product67 values(?,?,?,?)");
		PreparedStatement ps2=con.prepareStatement("select * from product67");
			@SuppressWarnings("unused")
			PreparedStatement ps3=con.prepareStatement("select * from product67 where code=?");
				while(true)
				{
					System.out.println("----choice--");
					System.out.println("\t1.AddProduct"
					+"\n\t2.ViewAllProducts"
							+"\n\t3.ViewProductByCode"
							+"\n\t4.DeleteProductByCode"
							+"\n\t6.Exit");
					System.out.println("Enter your choice:");
					switch(Integer.parseInt(sc.nextLine()))
							{
					case 1:
						System.out.println("enter product details");
						System.out.println("enter the product code:");
						String PC=sc.nextLine();
						System.out.println("enter product name:");
						String PN=sc.nextLine();
						System.out.println("enter the product price");
						float PP=Float.parseFloat(sc.nextLine());
						System.out.println("enter the product quantity");
						int PQ=Integer.parseInt(sc.nextLine());
						ps1.setString(1, PC);
						ps1.setString(2, PN);
						ps1.setFloat(3, PP);
						ps1.setInt(4, PQ);
						
						break;
					case 2:
						ResultSet rs=ps2.executeQuery();
						System.out.println("----product details----");
						System.out.println(rs.getString(1));
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						System.out.println("operations stopped....");
						System.exit(0);
						default:
							System.out.println("Invalid choice...");
							}
						
							}
					
					
					}
				
			
		
				
			
		
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
	
