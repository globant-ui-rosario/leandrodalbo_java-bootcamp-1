package com.topic5.leandro.topic5;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class JDBCMysqlConnection {

	private static JDBCMysqlConnection jdbcMysqlConnection = null;
	private Connection connection = null;

	private JDBCMysqlConnection() throws Exception {

		Class.forName("com.mysql.jdbc.Driver").newInstance();

		this.connection = (Connection) DriverManager
				.getConnection("jdbc:mysql://localhost:3306/highSchoolDb?" + "user=leandro&password=123456");

	}

	public static Connection getConnection() throws Exception {

		if (jdbcMysqlConnection == null) {

			jdbcMysqlConnection = new JDBCMysqlConnection();

		}

		return jdbcMysqlConnection.connection;

	}

	public static void closeConnection() {

		try {
			if (jdbcMysqlConnection.connection != null) {

				jdbcMysqlConnection.connection.close();

				jdbcMysqlConnection = null;
			}
		} catch (Exception e) {
			System.out.println("connection not closed");
		}

	}

}
