package services.basicmanagement.impl;

import javax.ejb.Stateless;

import services.basicmanagement.interfaces.UserManagementLocal;
import services.basicmanagement.interfaces.UserManagementRemote;

@Stateless
public class UserManagement implements UserManagementLocal, UserManagementRemote {

	@Override
	public void sayAhla(String name) {
		System.out.println("ahla wsahla ya :" + name);

	}

}
