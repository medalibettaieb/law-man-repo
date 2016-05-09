package services.registrationServices.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistence.User;
import services.registrationServices.interfaces.RegistrationServicesLocal;
import services.registrationServices.interfaces.RegistrationServicesRemote;

/**
 * Session Bean implementation class RegistrationServices
 */
@Stateless
public class RegistrationServices implements RegistrationServicesRemote, RegistrationServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public RegistrationServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);

	}

}
