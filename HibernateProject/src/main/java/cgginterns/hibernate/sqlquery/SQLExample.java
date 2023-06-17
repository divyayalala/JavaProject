package cgginterns.hibernate.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String query = "select * from student";
		
		NativeQuery query2 = session.createNativeQuery(query);
		query2.setFirstResult(0);
		query2.setMaxResults(6);
		List<Object []> list = query2.list();
		for(Object[] object :list) {
			//System.out.println(Arrays.toString(object));
			System.out.println(object[0]+" : "+object[1]+" : "+object[2]);
		}
		
		session.close();
		factory.close();

	}

}
