package beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import persistence.User;
import services.registrationServices.interfaces.RegistrationServicesLocal;

@ManagedBean
@SessionScoped
public class UserBean {
	@EJB
	private RegistrationServicesLocal registrationServicesLocal;
	private User user = new User();

	public String doAddUser() {
		registrationServicesLocal.addUser(user);
		return "/a";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
