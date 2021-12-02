 package JDBCTOSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m21","root","root");
			System.out.println(con);
			Statement st= con.createStatement();
			System.out.println(st);
			//String qury="insert into m21.empolyee(idEmpolyee,Ename,Eage,Esalry)values(2,'Roni',23,500000 )";
			String qury1="insert into rakesh.person (pid,pname,page) values (6,'Sharon',22)";
			int k=st.executeUpdate(qury1);
			System.out.println(k);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
