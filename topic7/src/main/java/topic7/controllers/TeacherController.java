package topic7.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javassist.bytecode.Descriptor.Iterator;
import topic7.model.Student;
import topic7.model.Teacher;
import topic7.repositories.TeacherRepository;

@RestController
public class TeacherController {

	@Autowired
	private TeacherRepository teacherRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/teachers")
	public List<Teacher> fetchAllTheTeachers() {

		List<Teacher> teachers = new ArrayList<Teacher>();

		java.util.Iterator<Teacher> iterator = teacherRepository.findAll().iterator();

		while (iterator.hasNext()) {

			teachers.add(iterator.next());

		}
		return teachers;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/teacher")
	public void createMeeting(@RequestBody Teacher teacher) {

		teacherRepository.save(teacher);

	}

}
