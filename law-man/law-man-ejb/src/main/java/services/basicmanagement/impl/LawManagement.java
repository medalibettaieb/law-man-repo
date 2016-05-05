package services.basicmanagement.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistence.Law;
import services.basicmanagement.interfaces.LawManagementLocal;
import services.basicmanagement.interfaces.LawManagementRemote;

/**
 * Session Bean implementation class LawManagement
 */
@Stateless
public class LawManagement implements LawManagementRemote, LawManagementLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public LawManagement() {
	}

	@Override
	public void addLaw(Law law) {
		entityManager.persist(law);

	}

}
