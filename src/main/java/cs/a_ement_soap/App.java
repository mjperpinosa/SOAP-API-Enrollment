package cs.a_ement_soap;

import cs.a_ement_soap.model.Student;

public class App {
	public static void main(String[] args) {

		System.out.println("To add students from main method.");
		Data.students.put("222", new Student(222, 12, "Mj2", "Perpi", "female", "Computer Science", 1));
		Data.students.put("333", new Student(333, 12, "Mj3", "Perpi", "female", "Computer Science", 1));
		Data.students.put("444", new Student(444, 12, "Mj4", "Perpi", "female", "Computer Science", 1));
		Data.students.put("555", new Student(555, 12, "Mj5", "Perpi", "female", "Computer Science", 1));
		
		System.out.println("Students added from main method.");
	}
}
