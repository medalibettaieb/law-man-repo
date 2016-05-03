package tests;

import persistence.Law;
import services.dao.LawDao;

public class TestAddLaw {
	private static LawDao lawDao = new LawDao();

	public static void main(String[] args) {
		// creation de law
		Law law = new Law();
		law.setId(1);
		law.setName("one");
		// adding the law
		lawDao.addLaw(law);

	}
}
