package topic7.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import topic7.model.Course;
import topic7.model.Student;
import topic7.repositories.CourseRepository;

@RestController
public class CourseController {

	@Autowired
	private CourseRepository courseRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/courses")
	public List<Course> fetchAllTheCourses() {

		List<Course> courses = new ArrayList<Course>();

		java.util.Iterator<Course> iterator = courseRepository.findAll().iterator();

		while (iterator.hasNext()) {

			courses.add(iterator.next());

		}
		return courses;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/course")
	public void createMeeting(@RequestBody Course course) {

		courseRepository.save(course);

	}

	@RequestMapping(value = "course/{id}/students", method = RequestMethod.GET)
	public List<Student> getCourseStudents(@PathVariable int id) {
		Course course = courseRepository.findOne(id);

		if (course != null) {
			return course.getStudents();
		} else {
			return null;
		}
	}

}