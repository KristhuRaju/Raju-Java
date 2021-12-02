package Com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Com.Pojo.Personpojo;

public class PersonDao {
	public void insert(Personpojo pp) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m21","root","root");
            System.out.println(con);
			String sql="insert into m21.Person (pid,pname,page)values(?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1, pp.getPid());
            pst.setString(2, pp.getPname());
            pst.setInt(3, pp.getPage());
            int k=pst.executeUpdate();
            System.out.println("No of rows Effects :"+k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
