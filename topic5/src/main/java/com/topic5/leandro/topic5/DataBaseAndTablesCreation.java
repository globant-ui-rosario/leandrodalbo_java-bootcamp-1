package com.topic5.leandro.topic5;

public class DataBaseAndTablesCreation {
	public static void main(String[] args) {
		try {

			QueryExecutor queryExecutor = new QueryExecutor(JDBCMysqlConnection.getConnection());

			queryExecutor.createDataBase("highSchoolDb");

			StringBuilder tableQuery = new StringBuilder();
			tableQuery.append("CREATE TABLE student ");
			tableQuery.append("(studentId INT NOT NULL AUTO_INCREMENT,");
			tableQuery.append("firstName VARCHAR(30), ");
			tableQuery.append("lastName VARCHAR(30), ");
			tableQuery.append("registrationNumber INT, ");
			tableQuery.append("dateOfBirth DATE, ");
			tableQuery.append("teacherId INT, ");
			tableQuery.append("PRIMARY KEY (studentId)); ");

			queryExecutor.createTable(tableQuery.toString());
			tableQuery = new StringBuilder();

			tableQuery.append("CREATE TABLE teacher ");
			tableQuery.append("(teacherId INT NOT NULL AUTO_INCREMENT,");
			tableQuery.append("firstName VARCHAR(30), ");
			tableQuery.append("lastName VARCHAR(30), ");
			tableQuery.append("dateOfBirth DATE, ");
			tableQuery.append("PRIMARY KEY (teacherId)); ");

			queryExecutor.createTable(tableQuery.toString());
			tableQuery = new StringBuilder();

			tableQuery.append("CREATE TABLE course ");
			tableQuery.append("(courseId INT NOT NULL AUTO_INCREMENT,");
			tableQuery.append("name VARCHAR(30), ");
			tableQuery.append("teacherId INT, ");
			tableQuery.append("registrationNumber INT, ");
			tableQuery.append("PRIMARY KEY (courseId)); ");

			queryExecutor.createTable(tableQuery.toString());
			tableQuery = new StringBuilder();

			tableQuery.append("CREATE TABLE evaluation ");
			tableQuery.append("(evaluationId INT NOT NULL AUTO_INCREMENT,");
			tableQuery.append("courseId INT, ");
			tableQuery.append("studentId INT, ");
			tableQuery.append("firstPartialNote INT, ");
			tableQuery.append("secondPartialNote INT, ");
			tableQuery.append("thirdPartialNote INT, ");
			tableQuery.append("finalNote INT, ");
			tableQuery.append("PRIMARY KEY (evaluationId)); ");

			queryExecutor.createTable(tableQuery.toString());
			tableQuery = new StringBuilder();

			tableQuery.append("CREATE TABLE courseSchedule ");
			tableQuery.append("(courseScheduleId INT NOT NULL AUTO_INCREMENT,");
			tableQuery.append("courseId INT, ");
			tableQuery.append("day VARCHAR(10), ");
			tableQuery.append("hour TIME, ");
			tableQuery.append("PRIMARY KEY (courseScheduleId)); ");

			queryExecutor.createTable(tableQuery.toString());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

			JDBCMysqlConnection.closeConnection();
		}
	}
}
