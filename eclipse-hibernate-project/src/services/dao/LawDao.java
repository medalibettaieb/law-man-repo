package services.dao;

import org.hibernate.Session;

import persistence.Law;
import utilities.HibernateUtil;

public class LawDao {
	private Session session = HibernateUtil.getSession();

	public void addLaw(Law law) {
		try {
			session.getTransaction().begin();

			session.persist(law);

			session.getTransaction().commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
		}

	}
}
