package services.registrationServices.interfaces;

import javax.ejb.Remote;

import persistence.User;

@Remote
public interface RegistrationServicesRemote {
	void addUser(User user);
}
