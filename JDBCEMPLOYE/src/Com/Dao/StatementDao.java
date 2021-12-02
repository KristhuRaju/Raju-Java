package Com.Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementDao {
	public satementpersonpojo m1() {
		satementpersonpojo s= new satementpersonpojo();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m21","root","root");
			System.out.println(con);
	String qury="insert into m21.satementperson  (spid,spname,spage)values(3,'sivani',21)";
	Statement st=con.createStatement();
	System.out.println(st);
	int k =st.executeUpdate(qury);
	System.out.println(k);
	
	String qury1="insert into m21.satementperson  (spid,spname,spage)values(4,'Sharon',22)";
	Statement st1=con.createStatement();
	System.out.println(st1);
	int k1 =st.executeUpdate(qury1);
	System.out.println(k1);
	
	
	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
		
	}
public static void main(String[] args) {
	StatementDao sd=new StatementDao();
	sd.m1();
}
}
