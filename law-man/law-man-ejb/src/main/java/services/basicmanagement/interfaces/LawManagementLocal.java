package services.basicmanagement.interfaces;

import javax.ejb.Local;

import persistence.Law;

@Local
public interface LawManagementLocal {
	void addLaw(Law law);
}
