package cgginterns.hibernate;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
public static void main(String[] args) {
	 SessionFactory factory = new Configuration().configure().buildSessionFactory();
     Session session = factory.openSession();
     //Address addr = (Address)session.get(Address.class,2);
//     System.out.println(addr);
       Address addr1 = (Address)session.load(Address.class,1);
//     System.out.println(addr.getCity()+" "+addr.getStreet());
     //fetching image logic
     byte[] image = addr1.getImage();
     try {
		FileOutputStream fos = new FileOutputStream("src/main/java/fetchedimage.jpg");
		fos.write(image);
		fos.flush();
		fos.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     session.close();
     factory.close();
}
}
