package Com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Com.Pojo.vendorpojo;

public class productDao {
	public static ArrayList<vendorpojo> getbyProduct(String pname){
		ArrayList<vendorpojo> alv=new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/r21","root","root");
			System.out.println(con);
			String qury="Select v.vid,v.vname from r21.product p inner join r21.vendor v inner join r21.pvdetails pv where p.pid=pv.fkpid and p.pname=?";
			PreparedStatement pst=con.prepareStatement(qury);
			pst.setString(1, pname);
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				vendorpojo vp=new vendorpojo();
				vp.setVid(rs.getInt("Vid"));
				vp.setVname(rs.getString("vname"));
				alv.add(vp);			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alv;
		
	}

}
