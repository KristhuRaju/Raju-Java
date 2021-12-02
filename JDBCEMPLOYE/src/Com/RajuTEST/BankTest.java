package Com.RajuTEST;

import Com.Dao.BankDao;
import Com.Pojo.Bankpojo;

public class BankTest {

	public static void main(String[] args) {
		BankDao bd=new BankDao();
		Bankpojo bk=new Bankpojo();
		bk.setBid(7);
		bk.setBname("Babu");
		bk.setBranch("Kola");
		bk.setBifsc(596203);
		bk.setBbal(9121111);
		
		bd.insert(bk);

	}

}
