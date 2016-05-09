package services.registrationServices.interfaces;

import javax.ejb.Local;

import persistence.User;

@Local
public interface RegistrationServicesLocal {
	void addUser(User user);
}
