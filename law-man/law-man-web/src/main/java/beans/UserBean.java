package beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import persistence.Agent;
import persistence.User;
import services.basicmanagement.interfaces.UserManagementLocal;
import services.registrationServices.interfaces.RegistrationServicesLocal;

@ManagedBean
@SessionScoped
public class UserBean {
	@EJB
	private RegistrationServicesLocal registrationServicesLocal;
	@EJB
	private UserManagementLocal userManagementLocal;

	private User user = new User();

	public String doAddUser() {
		registrationServicesLocal.addUser(user);
		return "/a";
	}

	public String doLogin() {
		String navigateTo = "";
		User userLoggedIn = userManagementLocal.login(user.getLogin(), user.getPassword());
		if (userLoggedIn != null) {
			user = userLoggedIn;
			if (userLoggedIn instanceof Agent) {
				navigateTo = "/pages/lawManagement/addLaw?faces-redirect=true";

			} else {
				navigateTo = "/pages/memberHome/home?faces-redirect=true";
			}

		}
		return navigateTo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
