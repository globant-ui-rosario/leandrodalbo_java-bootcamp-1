package topic7.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.JoinColumn;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "studentid")
	private int studentId;

	@Column(name = "firstname")
	private String firstName;

	@ManyToMany
	@JsonBackReference
	@JoinTable(name = "evaluation", joinColumns = @JoinColumn(name = "studentid", referencedColumnName = "studentid"), inverseJoinColumns = @JoinColumn(name = "courseid", referencedColumnName = "courseid"))
	private List<Course> courses = new ArrayList<Course>();

	public Student(int studentId, String firstName) {

		this.studentId = studentId;
		this.firstName = firstName;
	}

	public Student() {

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
