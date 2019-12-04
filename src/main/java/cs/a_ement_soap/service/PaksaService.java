package cs.a_ement_soap.service;

import cs.a_ement_soap.model.Paksa;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;



@WebService(serviceName="PaksaService")
public interface PaksaService {

	@WebMethod(operationName="addPaksa")
	@WebResult(name="Paksa")
	public String addPaksa(@WebParam(name="paksa") Paksa paksa);
	
	@WebMethod(operationName="getEnrolledPaksa")
	@WebResult(name="Paksa")
	public List<Paksa> getEnrolledPaksa(@WebParam(name="studentNumber") int studentNumber);
	
	@WebMethod(operationName="findAllPaksa")
	@WebResult(name="Paksa")
	public List<Paksa> findAllPaksa();
	
}
