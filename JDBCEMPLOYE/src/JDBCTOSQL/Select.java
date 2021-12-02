package JDBCTOSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m21","root","root");
	System.out.println(con);
      Statement st=con.createStatement();
      System.out.println(st);
      String qury5="select*from m21.empolyee";
      ResultSet rs= st.executeQuery(qury5);
      while(rs.next()) {
    	  System.out.println("Each row data******"+rs.getInt("idEmpolyee")+"---  "+rs.getString("Ename")+"---  "+rs.getInt("Eage")+"---  "+rs.getDouble("Esalry"));
    	  
    	  
      }
    
		System.out.println(rs);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}


