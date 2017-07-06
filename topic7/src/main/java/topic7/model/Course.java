package topic7.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue
	@Column(name = "courseid")
	private int courseId;

	@Column(name = "name")
	private String name;

	@ManyToMany
	@JsonBackReference
	@JoinTable(name = "evaluation", joinColumns = @JoinColumn(name = "courseid", referencedColumnName = "courseid"), inverseJoinColumns = @JoinColumn(name = "studentid", referencedColumnName = "studentid"))
	private List<Student> students = new ArrayList<Student>();

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
