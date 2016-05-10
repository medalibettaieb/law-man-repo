package services.basicmanagement.interfaces;

import javax.ejb.Local;

import persistence.User;

@Local
public interface UserManagementLocal {
	void sayAhla(String name);

	User login(String login, String password);
}
