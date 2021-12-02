package Com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Com.Pojo.Mobilepojo;
import Com.Pojo.Passportpojo;
import Com.Pojo.Personpojo;

public class PassportDao {
	public void insert(Passportpojo pt) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m21","root","root");
        System.out.println(con);
		String sql="insert into m21.passport(ppid,ppnum,ppexp,ppfkpid)values(?,?,?,?)";
        PreparedStatement pst=con.prepareStatement(sql);
        pst.setInt(1, pt.getPpid());
        pst.setInt(2, pt.getPpnum());
        pst.setInt(3, pt.getPpexp());
        pst.setInt(4, pt.getPpfkpid());
        int k=pst.executeUpdate();
        System.out.println("No of rows Effects :"+k);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
	}
	public Passportpojo ppgetbyName(String name) {
		Passportpojo pp=new Passportpojo();
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m21","root","root");
	        System.out.println(con);
	        String qury1="select * from m21.person inner join m21.Passport on pid=ppfkpid";
	        PreparedStatement pst= con.prepareStatement(qury1);
	       ResultSet k= pst.executeQuery();
	       while(k.next()) {
	    	   
	       
			pp.setPpid(k.getInt("ppid"));
			pp.setPpnum(k.getInt("ppnum"));
			pp.setPpexp(k.getInt("ppexp"));
			pp.setPpfkpid(k.getInt("ppfkpid"));
	       }
		}catch(Exception e) {
			e.printStackTrace();
		}
	        
		return pp;
		
	}
	public Personpojo getbypnamebyppnum(int num) {
		Personpojo pj=new Personpojo();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m21","root","root");
			System.out.println(con);
			String sql="select * from m21.person inner join m21.Passport on pid=ppfkpid where ppnum=?";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, num);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				pj.setPid(rs.getInt("ppid"));
				pj.setPname(rs.getString("pname"));
				pj.setPage(rs.getInt("page"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pj;
		
	}

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

