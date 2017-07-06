package topic7.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import topic7.model.Course;
import topic7.model.Student;
import topic7.repositories.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@RequestMapping("/students")
	public List<Student> fetchAllStudents() {
		List<Student> students = new ArrayList<Student>();
		Iterator iterator = studentRepository.findAll().iterator();

		while (iterator.hasNext()) {

			students.add((Student) iterator.next());
		}

		return students;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public void createMeeting(@RequestBody Student student) {

		studentRepository.save(student);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/studentsQuantity")
	public long studentsQuantity() {

		return studentRepository.count();

	}

	@RequestMapping(value = "student/{id}/courses", method = RequestMethod.GET)
	public List<Course> getStudentCoures(@PathVariable int id) {
		Student student = studentRepository.findOne(id);

		if (student != null) {
			return student.getCourses();
		} else {
			return null;
		}
	}

}