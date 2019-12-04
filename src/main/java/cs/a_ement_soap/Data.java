package cs.a_ement_soap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import cs.a_ement_soap.model.Enrollment;
import cs.a_ement_soap.model.Paksa;
import cs.a_ement_soap.model.Student;

@Component
public class Data {
	
	public static HashMap<String, Student> students = new HashMap<String, Student>();
	public static HashMap<String, Paksa> paksa = new HashMap<String, Paksa>();
	public static List<Enrollment> enrollments = new ArrayList<Enrollment>();

}
