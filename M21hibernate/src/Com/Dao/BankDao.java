package Com.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Com.Pojo.bank;

public class BankDao {
	public void insetrt() {
		Session s=hibconnection.getConnection();
		Transaction t=s.beginTransaction();
		bank b=new bank();
		b.setBid(3);
		b.setAnbr(7896);
		b.setName("Raju");
		s.save(b);
		t.commit();
		
	}

}
