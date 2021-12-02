package Com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Com.Pojo.presmpersonpojo;

public class PrePareSMDao {
	public presmpersonpojo m1(presmpersonpojo ps1) {
		presmpersonpojo ps =new presmpersonpojo();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m21","root","root");
			System.out.println(con);
			String qury="insert into m21.presmperson (pspid,pspname,pspage) values(?,?,?)";
			PreparedStatement pst=con.prepareStatement(qury);
			pst.setInt(1, ps1.getPspid());
			pst.setString(2, ps1.getPspname());
			pst.setInt(3, ps1.getPspage());
			int k=pst.executeUpdate();
			System.out.println(k);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
			
		return ps;
		
		
	}
	public static void main(String[] args) {
		
	}

}
