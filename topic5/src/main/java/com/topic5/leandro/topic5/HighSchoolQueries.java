package com.topic5.leandro.topic5;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class HighSchoolQueries {

	private QueryExecutor queryExecutor;

	public HighSchoolQueries() throws Exception {

		queryExecutor = new QueryExecutor(JDBCMysqlConnection.getConnection());

	}

	public void getTeacherAndStudentsOfTheCourse(int courseId) throws SQLException {

		StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append("select c.name, t.firstName, s.lastName ");
		queryBuilder.append("from  student s ,teacher t, course c ");
		queryBuilder.append("where c.courseId=? and c.teacherId=t.teacherId and t.teacherId=c.teacherId ");
		queryBuilder.append("order by c.name,t.firstName,s.firstName");

		PreparedStatement preparedStatement = (PreparedStatement) queryExecutor.getConnection().prepareStatement(queryBuilder.toString());

		preparedStatement.setInt(1, courseId);

		ResultSet resultSet = preparedStatement.executeQuery();

		boolean firstTime = true;

		while (resultSet.next()) {

			if (firstTime) {

				System.out.println(" Course: " + resultSet.getString("name"));
				System.out.println(" Course: " + resultSet.getString("firstName"));
				System.out.println(" Students:");
				firstTime = false;
			}

			System.out.println("          " + resultSet.getString("lastName"));
		}

	}

	public void getFinalNotesOfAstudent(int registrationNumber) throws SQLException {

		StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append("select c.name, e.finalNote ");
		queryBuilder.append("from student s inner join evaluation e on e.studentId=s.studentId ");
		queryBuilder.append("inner join course c on c.courseId=e.courseId ");
		queryBuilder.append("where s.registrationNumber=? ");
		queryBuilder.append("order by e.finalNote desc, c.name ");
		PreparedStatement preparedStatement = (PreparedStatement) queryExecutor.getConnection().prepareStatement(queryBuilder.toString());

		preparedStatement.setInt(1, registrationNumber);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			System.out.print("name " + resultSet.getString("name"));
			System.out.print("finalNote " + resultSet.getString("finalNote"));
			System.out.println();

		}

	}

	public void getPercentageOfStudentsThatPassedAcourse(int courseId) throws SQLException {

		StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append("select count(*)*100.0/(select count(*) from evaluation where courseId =1) as passed  ");
		queryBuilder.append("from evaluation ");
		queryBuilder.append("where courseId=? and finalNote<4 ");

		PreparedStatement preparedStatement = (PreparedStatement) queryExecutor.getConnection().prepareStatement(queryBuilder.toString());

		preparedStatement.setInt(1, courseId);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			System.out.print("Percentage: " + resultSet.getString("passed"));

		}

	}

	public void getTeacherTimeLine(int teacherId) throws SQLException {

		StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append("select t.firstName, t.lastName, cs.day, cs.hour, c.name ");
		queryBuilder.append("from teacher t, course c, courseSchedule cs ");
		queryBuilder.append("where c.teacherId=t.teacherId and c.courseId=cs.courseId and t.teacherId=? ");
		queryBuilder.append("order by day ");

		PreparedStatement preparedStatement = (PreparedStatement) queryExecutor.getConnection().prepareStatement(queryBuilder.toString());

		preparedStatement.setInt(1, teacherId);

		ResultSet resultSet = preparedStatement.executeQuery();

		boolean firstTime = true;

		while (resultSet.next()) {

			if (firstTime) {

				System.out.println(" Teacher: " + resultSet.getString("firstName") + ", " + resultSet.getString("lastName"));
				System.out.println(" Schedule: ");
				firstTime = false;
			}

			System.out.println("  " + resultSet.getString("day") + " " + resultSet.getString("hour") + " " + resultSet.getString("name"));
		}
	}

	public void createTable2ForStudents() throws SQLException {

		StringBuilder tableQuery = new StringBuilder();
		tableQuery.append("CREATE TABLE student2 ");
		tableQuery.append("(name VARCHAR(30), ");
		tableQuery.append("courseName VARCHAR(30), ");
		tableQuery.append("avarageNote INT); ");
		queryExecutor.createTable(tableQuery.toString());
	}

	public void alterTable2ForStudents() throws SQLException {

		StringBuilder tableQuery = new StringBuilder();
		tableQuery.append("ALTER TABLE student2 ");
		tableQuery.append("ADD COLUMN assignedTeacher INT; ");

		queryExecutor.executeStatement(tableQuery.toString());
	}

	public void deleteTheOldestTeacher() throws SQLException {

		StringBuilder tableQuery = new StringBuilder();
		tableQuery.append("delete from teacher ");
		tableQuery.append("order by dateOfBirth desc LIMIT 1 ");

		queryExecutor.executeStatement(tableQuery.toString());

	}
}
