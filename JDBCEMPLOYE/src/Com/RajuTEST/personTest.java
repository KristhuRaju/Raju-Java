package Com.RajuTEST;

import Com.Dao.PersonDao;
import Com.Pojo.Personpojo;

public class personTest {

	public static void main(String[] args) {
		PersonDao pd =new PersonDao();
		Personpojo pp=new Personpojo();
		pp.setPid(8);
		pp.setPname("Daniel");
		pp.setPage(24);
		
		pd.insert(pp);

	}

}
