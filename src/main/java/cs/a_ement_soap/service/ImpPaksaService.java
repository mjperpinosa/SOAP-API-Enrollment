package cs.a_ement_soap.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cs.a_ement_soap.Data;
import cs.a_ement_soap.model.Enrollment;
import cs.a_ement_soap.model.Paksa;

public class ImpPaksaService implements PaksaService {

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

	public String addPaksa(List<Paksa> mgaPaksa) {
		for(Paksa paksa : mgaPaksa) {
			Data.paksa.put(paksa.getSubjectCode(), paksa);
		}
		
		return "New paksa has been added.";
	}

}
