package Object_relations;

import java.util.ArrayList;
import java.util.Random;

public class ObjectRelationsExtraPart2 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Jim", "Stuff");
		Student s2 = new Student("John", "Magic");
		Student s3 = new Student("Jack", "Ship repairment");
		Student s4 = new Student("Ben", "Star mapping");
		Student s5 = new Student("Becky", "Science of humor");
		Student s6 = new Student("Ann", "Walking the plank");
		Student s7 = new Student("Benny Hill", "Redhead etiquette");
		Student s8 = new Student("Sussie", "History of magic wands");
		Student s9 = new Student("Lucy", "Dark humor");
		Student s10 = new Student("Bill", "Dad jokes");
		Student s11 = new Student("Donald Duck", "Maintenance of the Black Pearl");
		Student s12 = new Student("Popeye", "Health benefits of spinach");
		Student s13 = new Student("Harry Potter", "Quidditch");
		Student s14 = new Student("Hermione Granger", "Awesomeness of muggles");
		Student s15 = new Student("Darth Vader", "Proper usage of the Death Star");
		
		Lecturer l1 = new Lecturer("Dumbledore", 2, 9);
		Lecturer l2 = new Lecturer("Ron Weasley", 4, 8);
		Lecturer l3 = new Lecturer("Jack Sparrow", 3, 8);
		Lecturer l4 = new Lecturer("Charlie Chaplin", 4, 7);
		
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s8);
		students.add(s9);
		students.add(s10);
		students.add(s11);
		students.add(s12);
		students.add(s13);
		students.add(s14);
		students.add(s15);
		
		lecturers.add(l1);
		lecturers.add(l2);
		lecturers.add(l3);
		lecturers.add(l4);
		
		s1.setSupervisors(l1, l2);
		s2.setSupervisors(l1, l3);
		s3.setSupervisors(l1, l4);
		s4.setSupervisors(l2, l1);
		s5.setSupervisors(l2, l3);
		s6.setSupervisors(l2, l4);
		s7.setSupervisors(l3, l1);
		s8.setSupervisors(l3, l2);
		s9.setSupervisors(l3, l4);
		s10.setSupervisors(l4, l1);
		s11.setSupervisors(l4, l2);
		s12.setSupervisors(l4, l3);
		s13.setSupervisors(l1, l4);
		s14.setSupervisors(l4, l2);
		s15.setSupervisors(l3, l2);
		
		for (Student student : students) {
			student.applyToSupervisors();
			student.determineGrade();
			student.getExamInfo();
			System.out.println("");
		}
		
		for (Lecturer lecturer : lecturers) {
			lecturer.getEvaluation();
		}

	}

}
