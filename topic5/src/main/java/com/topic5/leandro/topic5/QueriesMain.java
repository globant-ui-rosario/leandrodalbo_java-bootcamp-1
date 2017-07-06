package com.topic5.leandro.topic5;

public class QueriesMain {

	public static void main(String[] args) {

		try {

			HighSchoolQueries highSchoolQueries = new HighSchoolQueries();

			highSchoolQueries.getTeacherAndStudentsOfTheCourse(1);
			highSchoolQueries.getFinalNotesOfAstudent(1111);
			highSchoolQueries.getPercentageOfStudentsThatPassedAcourse(1);
			highSchoolQueries.getTeacherTimeLine(1);
			highSchoolQueries.createTable2ForStudents();
			highSchoolQueries.alterTable2ForStudents();
			highSchoolQueries.deleteTheOldestTeacher();

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {
			JDBCMysqlConnection.closeConnection();
		}

	}

}
