package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.basicmanagement.interfaces.UserManagementRemote;

public class TestSayAhla {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserManagementRemote proxy = (UserManagementRemote) context.lookup(
				"law-man-ear/law-man-ejb/UserManagement!services.basicmanagement.interfaces.UserManagementRemote");

		proxy.sayAhla("sala7");
	}

}
