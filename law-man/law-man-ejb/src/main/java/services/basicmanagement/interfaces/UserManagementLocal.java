package services.basicmanagement.interfaces;

import javax.ejb.Local;

@Local
public interface UserManagementLocal {
	void sayAhla(String name);
}
