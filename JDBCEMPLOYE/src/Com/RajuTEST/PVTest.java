package Com.RajuTEST;

import java.util.ArrayList;

import Com.Dao.productDao;
import Com.Dao.vendorDao;
import Com.Pojo.productpojo;
import Com.Pojo.vendorpojo;

public class PVTest {

	public static void main(String[] args) {
		productDao pd= new productDao();
		ArrayList<vendorpojo> avp=pd.getbyProduct("rice");
		for(vendorpojo v:avp)
		System.out.println(v.getVid()+" "+v.getVname());
		System.out.println("==============================================");
		
		vendorDao vd=new vendorDao();
		ArrayList<productpojo> avp1=vd.getbyVendor("surya");
		for(productpojo v1:avp1)
		System.out.println(v1.getPid()+" "+v1.getPname());
		System.out.println("==============================================");
		

	}

	}


