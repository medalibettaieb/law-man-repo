package services.basicmanagement.interfaces;

import javax.ejb.Remote;

import persistence.Law;

@Remote
public interface LawManagementRemote {
	void addLaw(Law law);

}
