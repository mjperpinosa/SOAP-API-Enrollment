package cs.a_ement_soap.service;

import java.util.List;

import cs.a_ement_soap.Data;
import cs.a_ement_soap.model.Enrollment;
import cs.a_ement_soap.model.Paksa;

public class ImpEnrollmentService implements EnrollmentService {
	
	public String addEnrollment(int studentNumber, List<String> paksaCodesToEnroll) {
		Enrollment ement;
		for(String paksaCode : paksaCodesToEnroll) {
			ement = new Enrollment();
			ement.setPaksaCode(paksaCode);
			ement.setStudentNumber(studentNumber);
			Data.enrollments.add(ement);
		}
		
		return "Paksa successfully enrolled.";
	}

	public String dropEnrollment(Enrollment enrollment) {
		int index = -1;
		for(int i = 0; i < Data.enrollments.size(); i++) {
			if(enrollment.getPaksaCode().equalsIgnoreCase(Data.enrollments.get(i).getPaksaCode()) && enrollment.getStudentNumber() == Data.enrollments.get(i).getStudentNumber()) {
				index = i;
				break;
			}
		}
		Data.enrollments.remove(index);
		
		return "Student with number " + enrollment.getStudentNumber() + " has dropped the subject with code " + enrollment.getPaksaCode() + "."; 
	}

	public List<Enrollment> findAllEnrollments() {
		return Data.enrollments;
	}

	public String dropEnrollment(int studentNumber, List<String> paksaCodesToDrop) {
		int index;
		for(int i = 0; i < paksaCodesToDrop.size(); i++) {
			index = -1;
			for(int j = 0; j < Data.enrollments.size(); j++) {
				if(paksaCodesToDrop.get(i).equalsIgnoreCase(Data.enrollments.get(j).getPaksaCode()) && studentNumber == Data.enrollments.get(j).getStudentNumber()) {
					index = j;
					break;
				}
			}
			if(index != -1)
				Data.enrollments.remove(index);
		}
		return "Paksa successfully dropped."; 
	}

}
