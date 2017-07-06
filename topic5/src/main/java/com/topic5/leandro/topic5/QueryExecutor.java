package com.topic5.leandro.topic5;

import java.sql.SQLException;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class QueryExecutor {

	private Statement statement;
	private Connection connection;

	public QueryExecutor(Connection connection) throws SQLException, Exception {

		this.connection = connection;
		this.statement = (Statement) connection.createStatement();
	}

	public void createDataBase(String dataBaseName) throws SQLException {
		String sql = "CREATE DATABASE " + dataBaseName;
		statement.executeUpdate(sql);
	}

	public void createTable(String query) throws SQLException {

		statement.executeUpdate(query);

	}

	public void executeStatement(String myStatement) throws SQLException {

		statement.executeUpdate(myStatement);

	}

	public Statement getStatement() {
		return statement;
	}

	public Connection getConnection() {
		return connection;
	}

}
