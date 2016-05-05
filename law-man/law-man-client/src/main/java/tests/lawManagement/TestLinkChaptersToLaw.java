package tests.lawManagement;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Chapter;
import services.basicmanagement.interfaces.LawManagementRemote;

public class TestLinkChaptersToLaw {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		LawManagementRemote proxy = (LawManagementRemote) context.lookup(
				"law-man-ear/law-man-ejb/LawManagement!services.basicmanagement.interfaces.LawManagementRemote");

		List<Chapter> chapters = new ArrayList<>();

		Chapter chapter = new Chapter();
		chapter.setId(1);
		chapter.setName("chap1");
		Chapter chapter2 = new Chapter();
		chapter2.setId(2);
		chapter2.setName("chap2");

		chapters.add(chapter);
		chapters.add(chapter2);

		proxy.linkChaptersToLaw(2, chapters);
	}

}
