package cs.a_ement_soap.model;

public class Enrollment {
	private int studentNumber;
	private String paksaCode;
	
	public Enrollment(int studentNumber, String paksaCode) {
		this.studentNumber = studentNumber;
		this.paksaCode = paksaCode;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getPaksaCode() {
		return paksaCode;
	}
	public void setPaksaCode(String paksaCode) {
		this.paksaCode = paksaCode;
	}
	
	
}
