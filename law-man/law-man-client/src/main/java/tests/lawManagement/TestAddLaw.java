package tests.lawManagement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Law;
import persistence.TypeLaw;
import services.basicmanagement.interfaces.LawManagementRemote;

public class TestAddLaw {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		LawManagementRemote proxy = (LawManagementRemote) context.lookup(
				"law-man-ear/law-man-ejb/LawManagement!services.basicmanagement.interfaces.LawManagementRemote");

		Law law = new Law();
		law.setId(2);
		law.setText("9anoun baladiat");
		law.setTypeLaw(TypeLaw.CONVENTION);

		proxy.addLaw(law);
	}

}
