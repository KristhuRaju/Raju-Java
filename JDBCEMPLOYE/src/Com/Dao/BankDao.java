package Com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Com.Pojo.Bankpojo;

public class BankDao {
	public void insert (Bankpojo bp) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m21","root","root");
			String qury="insert into m21.Bank (Bid,Bname,Bbranch,Bisfc,Bbal) values (?,?,?,?,?)";
			System.out.println(con);
			PreparedStatement pst=con.prepareStatement(qury);
			pst.setInt(1, bp.getBid());
			pst.setString(2, bp.getBname());
			pst.setString(3, bp.getBranch());
			pst.setInt(4, bp.getBifsc());
			pst.setDouble(5, bp.getBbal());
			int k=pst.executeUpdate();
			System.out.println(k);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

}
}
