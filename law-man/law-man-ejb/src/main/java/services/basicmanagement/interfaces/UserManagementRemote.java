package services.basicmanagement.interfaces;

import javax.ejb.Remote;

@Remote
public interface UserManagementRemote {
	void sayAhla(String name);
}
