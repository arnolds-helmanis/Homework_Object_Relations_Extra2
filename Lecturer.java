package Object_relations;

import java.util.HashSet;

public class Lecturer {
	String name;
	int minGrade;
	int maxGrade;
	HashSet<Student> iAmLecturerTo = new HashSet<Student>();
	HashSet<Student> iamReviewerTo = new HashSet<Student>();
	
	
	Lecturer(String name, int minGrade, int maxGrade) {
		this.name = name;
		this.minGrade = minGrade;
		this.maxGrade = maxGrade;
	}
	
	void getEvaluation() {
		// Determines the correct ending of the word 'student' depending on the size of the group of supervised students
		String stud = "student";
		if (this.iAmLecturerTo.size() > 1) {
			stud = "students";
		}
		// prints out the list of students the lecturer supervised and their respective names, project themes and grades
		System.out.println(this.name + " supervised " + this.iAmLecturerTo.size() + " " + stud + ": ");
		for (Student student : this.iAmLecturerTo) {
			System.out.println("  " + student.name + " on '" + student.project + "' got " + student.grade);
		}
		
		String st = "student's";
		if (this.iamReviewerTo.size() > 1) {
			st = "students'";
		}
		// prints out how many students' works this lecturer reviewed and what kind of grades he assessed
		System.out.println(this.name + " reviewed " + this.iamReviewerTo.size() + " " + st + " thesis and graded them:");
		String delimiter = ", ";
		Student[] temp = this.iamReviewerTo.toArray(new Student[this.iamReviewerTo.size()]);
		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1) {
				delimiter = "";
			}
			System.out.print(temp[i].getStudentGradeByReviewer() + delimiter);
		}
		System.out.println("\n");
	}
	
	public String toString() {
		return this.name;
	}

}
