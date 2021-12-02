package Com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import Com.Pojo.Employee;

public class empcritiria {
	public void getall() {
		Session s=hibconnection.getConnection();
		Criteria c =s.createCriteria(Employee.class);
		List<Employee> e=c.list();
		for(Employee e1:e) {
			System.out.println(e1.getEid()+" "+e1.getEname()+" "+e1.getEage()+" "+e1.getEsalry());
		}
		
	}
	public void m1() {
		Session s1=hibconnection.getConnection();
		Criteria c1=s1.createCriteria(Employee.class);
		c1.add(Restrictions.gt("Eid", 3));
		List<Employee> e1=c1.list();
		for(Employee s2:e1) {
			System.out.println(s2.getEid()+" "+s2.getEname()+" "+s2.getEage()+" "+s2.getEsalry());
		}
	}

}
