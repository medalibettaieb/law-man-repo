package services.registrationServices.interfaces;

import javax.ejb.Local;

import persistence.Law;
import persistence.User;

@Local
public interface RegistrationServicesLocal {
	void addUser(User user);
	void addLaw(Law law);
}
