package cs.a_ement_soap.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import cs.a_ement_soap.model.Enrollment;

@WebService(serviceName="StudentService")
public interface EnrollmentService {
	
	@WebMethod(operationName="enrollSubject")
	@WebResult(name="Enrollment")
	public String addEnrollment(@WebParam(name="enrollment") Enrollment enrollment);
	
	
	@WebMethod(operationName="dropEnrollment")
	@WebResult(name="Enrollment")
	public String dropEnrollment(@WebParam(name="enrollment") Enrollment enrollment);
	
	@WebMethod(operationName="findAllEnrollments")
	@WebResult(name="Enrollment")
	public List<Enrollment> findAllEnrollments();
}
