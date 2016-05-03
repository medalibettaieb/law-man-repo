package utilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Session session;
	private static SessionFactory sessionFactory;

	public static Session getSession() {
		if (session == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.getCurrentSession();
		}
		return session;
	}
}
