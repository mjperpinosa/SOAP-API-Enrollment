package cs.a_ement_soap.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cs.a_ement_soap.Data;
import cs.a_ement_soap.model.Enrollment;
import cs.a_ement_soap.model.Paksa;

public class ImpPaksaService implements PaksaService {
	
	public String addPaksa(Paksa paksa) {
		Data.paksa.put(paksa.getSubjectCode(), paksa);
		
		return "New paksa was added.";
	}

	public List<Paksa> getEnrolledPaksa(int studentNumber) {
		List<Paksa> enrolledPaksa = new ArrayList<Paksa>();
		for(Enrollment ement : Data.enrollments) {
			if(ement.getStudentNumber() == studentNumber) {
				enrolledPaksa.add(Data.paksa.get(ement.getPaksaCode()));
			}
		}
		
		return enrolledPaksa;
	}
	
	public List<Paksa> findAllPaksa() {
		return getListOfPaksa();
	}
	
	public List<Paksa> getListOfPaksa() {
		Collection<Paksa> paksa = Data.paksa.values(); 		         
		ArrayList<Paksa> allPaksa = new ArrayList<Paksa>(paksa);
		
		return allPaksa;
	}

	

//	public Subject getData(String name) {
//		Subject subject = new Subject();
//		subject.setName("Assembly Language");
//		subject.setSubjectCode("CS200");
//		subject.setDescription("Assembly Language");
//		subject.setUnits(3);
//		subject.setStatus(1);
//		return subject;
//	}
//
//	public Subject getAll(int age) {
//		Subject subject = new Subject();
//		subject.setName("Algorithm Analysis");
//		subject.setSubjectCode("CS100");
//		subject.setDescription("Algorithm Analysis");
//		subject.setUnits(3);
//		subject.setStatus(1);
//		return subject;
//	}

}
