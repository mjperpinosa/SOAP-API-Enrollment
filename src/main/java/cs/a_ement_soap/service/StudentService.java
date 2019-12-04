package cs.a_ement_soap.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import cs.a_ement_soap.model.Student;


@WebService(serviceName="StudentService")
public interface StudentService {
	@WebMethod(operationName="addStudent")
	@WebResult(name="Student")
	public String addStudent(@WebParam(name="student") Student student);
	
	@WebMethod(operationName="findAllStudent")
	@WebResult(name="Student")
	public List<Student> findAllStudent();
}
