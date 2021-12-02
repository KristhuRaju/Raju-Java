package Com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Com.Pojo.productpojo;

public class vendorDao {
	public ArrayList<productpojo> getbyVendor(String vName){
		ArrayList<productpojo> app=new ArrayList<productpojo>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/r21","root","root");
			System.out.println(con);
			String qury="Select p.pid,p.pname from r21.product p inner join r21.vendor v inner join r21.pvdetails pv where v.vid=pv.fkvid and v.vname=?";
			PreparedStatement pst=con.prepareStatement(qury);
			pst.setNString(1, vName);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				productpojo pa=new productpojo();
				pa.setPid(rs.getInt("pid"));
				pa.setPname(rs.getString("pname"));
				
				app.add(pa);
				
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return app;
		
	}

}
