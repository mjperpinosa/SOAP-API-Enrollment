package cs.a_ement_soap.service;

import javax.jws.WebService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cs.a_ement_soap.Data;
import cs.a_ement_soap.model.Student;

public class ImpStudentService implements StudentService {

	
	public List<Student> findAllStudent() {
		Collection<Student> students = Data.students.values(); 		         
		ArrayList<Student> allStudents = new ArrayList<Student>(students);
		
		return allStudents;
	}
	
	public String addStudent(Student student) {
		Data.students.put(student.getStudentNumber()+"", student);
		System.out.println("Student added.");
		
		return "New student has been added.";
	}

}
