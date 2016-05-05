package tests.lawManagement;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Chapter;
import persistence.Law;
import services.basicmanagement.interfaces.LawManagementRemote;

public class TestFindLawById {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		LawManagementRemote proxy = (LawManagementRemote) context.lookup(
				"law-man-ear/law-man-ejb/LawManagement!services.basicmanagement.interfaces.LawManagementRemote");

		Law law = proxy.findLawById(1);
		System.out.println(law.getText());
		List<Chapter> chapters = proxy.findChaptersByLawId(1);
		for (Chapter c : chapters) {
			System.out.println(c.getLaw().getId());
		}
	}

}
