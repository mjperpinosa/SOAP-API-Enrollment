package cs.a_ement_soap.service;

import java.util.List;

import cs.a_ement_soap.Data;
import cs.a_ement_soap.model.Enrollment;

public class ImpEnrollmentService implements EnrollmentService {

	public String addEnrollment(Enrollment enrollment) {
		Data.enrollments.add(enrollment);
		
		return "Student with number " + enrollment.getStudentNumber() + " has enrolled the subject with code " + enrollment.getPaksaCode() + ".";
	}

	public String dropEnrollment(Enrollment enrollment) {
		Data.enrollments.remove(enrollment);
		
		return "Student with number " + enrollment.getStudentNumber() + " has dropped the subject with code " + enrollment.getPaksaCode() + "."; 
	}

	public List<Enrollment> findAllEnrollments() {
		return Data.enrollments;
	}

}
