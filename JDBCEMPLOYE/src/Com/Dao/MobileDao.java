package Com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Com.Pojo.Mobilepojo;

public class MobileDao {
	public ArrayList<Mobilepojo> getmobileDetails(String name){
		ArrayList<Mobilepojo> mp=new ArrayList<Mobilepojo>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m21","root","root");
			System.out.println(con);
			String sql= "select * from m21.person inner join m21.mobile on pid=fkpid where pname=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, name);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Mobilepojo mb=new Mobilepojo();
				mb.setMid(rs.getInt("mid"));
				mb.setMsim(rs.getString("msim"));
				mb.setMnuber(rs.getInt("mnuber"));
				mp.add(mb);
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return mp;
		
	}
		

}
