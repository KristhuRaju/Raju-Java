package Com.RajuTEST;

import java.util.ArrayList;

import Com.Dao.PassportDao;
import Com.Dao.PersonDao;
import Com.Pojo.Mobilepojo;
import Com.Pojo.Passportpojo;
import Com.Pojo.Personpojo;

public class PassportTest {

	public static void main(String[] args) {
		
			PassportDao pd =new PassportDao();
			//Passportpojo pt=new Passportpojo();
			/*pt.setPpid(8);
			pt.setPpnum(484566);
			pt.setPpexp(2007);
			pt.setPpfkpid(8);
			
			
			pd.insert(pt);*/
			
			
			/*Passportpojo pt=pd.ppgetbyName("joel");
			System.out.println(pt.getPpid()+" "+pt.getPpnum()+" "+pt.getPpexp()+" "+pt.getPpfkpid());
			*/
			
			/*Personpojo p=pd.getbypnamebyppnum(2589);
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPage());*/
			
			ArrayList<Mobilepojo> mp=pd.getmobileDetails("raju");
			for(Mobilepojo k:mp) {
				System.out.println(k.getMid()+" "+k.getMsim()+" "+k.getMnuber());
			}
			

		}

	}


