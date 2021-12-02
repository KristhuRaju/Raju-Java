package JDBCTOSQL;

import java.sql.*;/*
							import java.sql.DriverManager;
							import java.sql.ResultSet;
							import java.sql.Statement;*/ 

public class IDU {

	public static void main(String[] args) {
		
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m21","root","root");
	System.out.println(con);
      Statement st=con.createStatement();
      String qury="insert into m21.empolyee(idEmpolyee,Ename,Eage,Esalry)values(3,'Rajesh',24,600000 )";
      String qury1="insert into m21.empolyee(idEmpolyee,Ename,Eage,Esalry)values(4,'Ravi',25,700000 )";
      String qury2="insert into m21.empolyee(idEmpolyee,Ename,Eage,Esalry)values(5,'Rajaja',26,800000 )";
      String qury3="update m21.empolyee set Ename='SH' where idEmpolyee=5";
      String qury4="delete from m21.empolyee where Ename='Ravi'";
      String qury5="select*from m21.empolyee";
      ResultSet rs= st.executeQuery(qury5);
      while(rs.next()) {
    	  System.out.println("Each row data******"+rs.getInt("idEmpolyee")+"---  "+rs.getString("Ename")+"---  "+rs.getInt("Eage")+"---  "+rs.getDouble("Esalry"));
    	  
    	  
      }
      //int k=st.executeUpdate(qury4);
		System.out.println(rs);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
