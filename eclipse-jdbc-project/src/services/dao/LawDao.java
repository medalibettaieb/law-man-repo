package services.dao;

import java.sql.SQLException;
import java.sql.Statement;

import persistence.Law;
import utilities.JdbcUtility;

public class LawDao {
	private Statement statement;

	public void addLaw(Law law) {
		String sql = "insert into law values(" + law.getId() + ",'" + law.getName() + "') ";
		try {
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Statement getStatement() {
		try {
			statement = JdbcUtility.giveMeJdbcConnection().createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statement;
	}

}
