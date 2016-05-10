package services.basicmanagement.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistence.User;
import services.basicmanagement.interfaces.UserManagementLocal;
import services.basicmanagement.interfaces.UserManagementRemote;

@Stateless
public class UserManagement implements UserManagementLocal, UserManagementRemote {
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void sayAhla(String name) {
		System.out.println("ahla wsahla ya :" + name);

	}

	@Override
	public User login(String login, String password) {
		return (User) entityManager.createQuery("SELECT u FROM User u WHERE u.login =:l AND u.password = :p")
				.setParameter("l", login).setParameter("p", password).getSingleResult();
	}

}
