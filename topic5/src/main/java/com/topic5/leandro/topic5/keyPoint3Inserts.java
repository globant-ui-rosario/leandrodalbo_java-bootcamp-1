package com.topic5.leandro.topic5;

public class keyPoint3Inserts {

	public static void main(String[] args) {

		try {

			QueryExecutor queryExecutor = new QueryExecutor(JDBCMysqlConnection.getConnection());
			StringBuilder stringBuilder = new StringBuilder();

			stringBuilder.append("INSERT INTO teacher");
			stringBuilder.append("(teacherId, firstName, lastName, dateOfBirth)");
			stringBuilder.append("VALUES (DEFAULT,'teacher0','teacher0',CURRENT_DATE)");
			queryExecutor.executeStatement(stringBuilder.toString());
			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO teacher");
			stringBuilder.append("(teacherId, firstName, lastName, dateOfBirth)");
			stringBuilder.append("VALUES (DEFAULT,'teacher1','teacher1',CURRENT_DATE)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO teacher");
			stringBuilder.append("(teacherId, firstName, lastName, dateOfBirth)");
			stringBuilder.append("VALUES (DEFAULT,'teacher2','teacher2',CURRENT_DATE)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO course");
			stringBuilder.append("(courseId, name,teacherId, hoursPerWeek)");
			stringBuilder.append("VALUES (DEFAULT,'course1',1,5)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO course");
			stringBuilder.append("(courseId, name,teacherId, hoursPerWeek)");
			stringBuilder.append("VALUES (DEFAULT,'course2',1,10)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO course");
			stringBuilder.append("(courseId, name,teacherId, hoursPerWeek)");
			stringBuilder.append("VALUES (DEFAULT,'course3',1,5)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO course");
			stringBuilder.append("(courseId, name,teacherId, hoursPerWeek)");
			stringBuilder.append("VALUES (DEFAULT,'course4',1,5)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO course");
			stringBuilder.append("(courseId, name,teacherId, hoursPerWeek)");
			stringBuilder.append("VALUES (DEFAULT,'course5',1,7)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO student");
			stringBuilder.append("(studentId, firstName, lastName, registrationNumber, dateOfBirth, teacherId)");
			stringBuilder.append("VALUES (DEFAULT,'studen1','student1',1111,STR_TO_DATE('12-02-2000','%d-%m-%Y'),1)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO student");
			stringBuilder.append("(studentId, firstName, lastName, registrationNumber, dateOfBirth, teacherId)");
			stringBuilder.append("VALUES (DEFAULT,'studen2','student2',2222,STR_TO_DATE('23-02-2004','%d-%m-%Y'),1)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO student");
			stringBuilder.append("(studentId, firstName, lastName, registrationNumber, dateOfBirth, teacherId)");
			stringBuilder.append("VALUES (DEFAULT,'studen3','student3',22342,STR_TO_DATE('10-04-2001','%d-%m-%Y'),2)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO student");
			stringBuilder.append("(studentId, firstName, lastName, registrationNumber, dateOfBirth, teacherId)");
			stringBuilder.append("VALUES (DEFAULT,'studen4','student4',22322,STR_TO_DATE('13-02-1994','%d-%m-%Y'),2)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO student");
			stringBuilder.append("(studentId, firstName, lastName, registrationNumber, dateOfBirth, teacherId)");
			stringBuilder.append("VALUES (DEFAULT,'studen5','student5',4222,STR_TO_DATE('22-01-2004','%d-%m-%Y'),3)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO student");
			stringBuilder.append("(studentId, firstName, lastName, registrationNumber, dateOfBirth, teacherId)");
			stringBuilder.append("VALUES (DEFAULT,'studen6','student6',22234,STR_TO_DATE('9-08-2016','%d-%m-%Y'),2)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO student");
			stringBuilder.append("(studentId, firstName, lastName, registrationNumber, dateOfBirth, teacherId)");
			stringBuilder.append("VALUES (DEFAULT,'studen7','student7',452222,STR_TO_DATE('5-05-2011','%d-%m-%Y'),2)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO student");
			stringBuilder.append("(studentId, firstName, lastName, registrationNumber, dateOfBirth, teacherId)");
			stringBuilder.append("VALUES (DEFAULT,'studen8','student8',5622,STR_TO_DATE('4-02-2004','%d-%m-%Y'),1)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO student");
			stringBuilder.append("(studentId, firstName, lastName, registrationNumber, dateOfBirth, teacherId)");
			stringBuilder.append("VALUES (DEFAULT,'studen9','student9',222452,STR_TO_DATE('2-02-2004','%d-%m-%Y'),2)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO student");
			stringBuilder.append("(studentId, firstName, lastName, registrationNumber, dateOfBirth, teacherId)");
			stringBuilder.append("VALUES (DEFAULT,'studen10','student10',223222,STR_TO_DATE('2-02-2001','%d-%m-%Y'),3)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO student");
			stringBuilder.append("(studentId, firstName, lastName, registrationNumber, dateOfBirth, teacherId)");
			stringBuilder.append("VALUES (DEFAULT,'studen11','student11',1222,STR_TO_DATE('23-02-2007','%d-%m-%Y'),2)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO student");
			stringBuilder.append("(studentId, firstName, lastName, registrationNumber, dateOfBirth, teacherId)");
			stringBuilder.append("VALUES (DEFAULT,'studen12','student12',2222,STR_TO_DATE('23-02-2000','%d-%m-%Y'),3)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO evaluation");
			stringBuilder.append("(evaluationId, courseId, studentId, firstPartialNote, secondPartialNote,thirdPartialNote,finalNote)");
			stringBuilder.append("VALUES (DEFAULT,1,1,7,7,7,7)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO evaluation");
			stringBuilder.append("(evaluationId, courseId, studentId, firstPartialNote, secondPartialNote,thirdPartialNote,finalNote)");
			stringBuilder.append("VALUES (DEFAULT,1,2,3,4,7,8)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO evaluation");
			stringBuilder.append("(evaluationId, courseId, studentId, firstPartialNote, secondPartialNote,thirdPartialNote,finalNote)");
			stringBuilder.append("VALUES (DEFAULT,2,2,7,7,7,7)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO evaluation");
			stringBuilder.append("(evaluationId, courseId, studentId, firstPartialNote, secondPartialNote,thirdPartialNote,finalNote)");
			stringBuilder.append("VALUES (DEFAULT,10,2,7,7,5,8)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO evaluation");
			stringBuilder.append("(evaluationId, courseId, studentId, firstPartialNote, secondPartialNote,thirdPartialNote,finalNote)");
			stringBuilder.append("VALUES (DEFAULT,1,3,3,4,4,5)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO evaluation");
			stringBuilder.append("(evaluationId, courseId, studentId, firstPartialNote, secondPartialNote,thirdPartialNote,finalNote)");
			stringBuilder.append("VALUES (DEFAULT,5,2,4,5,5,7)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO courseSchedule");
			stringBuilder.append("(courseScheduleId, courseId, day, hour)");
			stringBuilder.append("VALUES (DEFAULT,5,'monday',CURRENT_TIME)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO courseSchedule");
			stringBuilder.append("(courseScheduleId, courseId, day, hour)");
			stringBuilder.append("VALUES (DEFAULT,4,'monday',CURRENT_TIME)");
			queryExecutor.executeStatement(stringBuilder.toString());

			stringBuilder = new StringBuilder();
			stringBuilder.append("INSERT INTO courseSchedule");
			stringBuilder.append("(courseScheduleId, courseId, day, hour)");
			stringBuilder.append("VALUES (DEFAULT,5,'friday',CURRENT_TIME)");
			queryExecutor.executeStatement(stringBuilder.toString());

		} catch (

		Exception e) {
			System.out.println(e.getMessage());
		} finally {

			JDBCMysqlConnection.closeConnection();
		}

	}

}
