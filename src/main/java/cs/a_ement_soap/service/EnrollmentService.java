package cs.a_ement_soap.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import cs.a_ement_soap.model.Enrollment;
import cs.a_ement_soap.model.Paksa;

@WebService(serviceName="StudentService")
public interface EnrollmentService {
	
	@WebMethod(operationName="enrollSubject")
	@WebResult(name="Enrollment")
	public String addEnrollment(@WebParam(name="studentNumber") int studentNumber, @WebParam(name="paksaCode") List<String> paksaCodesToEnroll);
	
	
	@WebMethod(operationName="dropEnrollment")
	@WebResult(name="Enrollment")
	public String dropEnrollment(@WebParam(name="studentNumber") int studentNumber, @WebParam(name="paksaCode") List<String> paksaCodesToDrop);
	
	@WebMethod(operationName="findAllEnrollments")
	@WebResult(name="Enrollment")
	public List<Enrollment> findAllEnrollments();
}
