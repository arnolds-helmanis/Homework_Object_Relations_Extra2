package Object_relations;

import java.util.Random;

public class Student {
	String name;
	private Lecturer lecturer;
	private Lecturer reviewer;
	int grade;
	String project;
	
	Student(String name, String project) {
		this.name = name;
		this.project = project;
	}
	
	
	void setLecturer(Lecturer lecturer) {
		// checks if this student's lecturer spot is free
		if (this.lecturer == null) {
			// checks if this student's reviewer spot is also free, if it is free then the passed Lecturer in this method can be 
			// safely assigned as a lecturer of this student
			if (this.reviewer == null) {
				this.lecturer = lecturer;
				System.out.println(this.name + ", now your lecturer is " + lecturer.name + ".");
				return;
			// checks if the names of lecturer and reviewer are the same, if this student already have a reviewer 
			} else if (lecturer.name == this.reviewer.name) {
				System.out.println(this.name +", your lecturer can't be " + lecturer.name + ", because lecturer and reviewer can't be the same person. You must choose different person as your lecturer!");
				return;
			} else {
				this.lecturer = lecturer;
				System.out.println(this.name + ", now your lecturer is " + lecturer.name + ".");
			}
		} else {
			System.out.println(this.name + " already have a lecturer: " + this.lecturer.name);
		}
	}
	
	void setReviewer (Lecturer reviewer) {
		// checks if this student's reviewer spot is free
		if (this.reviewer == null) {
			// checks if this student's lecturer spot is also free, if it is free then the passed Reviewer in this method can be 
			// safely assigned as a reviewer of this student
			if (this.lecturer == null) {
				this.reviewer = reviewer;
				System.out.println(this.name + ", now your reviewer is " + reviewer.name + ".");
				return;
			// checks if the names of lecturer and reviewer are the same, if this student already have a reviewer
			} else if (reviewer.name == this.lecturer.name) {
				System.out.println(this.name +", your reviewer can't be " + reviewer.name + ", because lecturer and reviewer can't be the same person. You must choose different person as your reviewer!");
				return;
			} else {
				this.reviewer = reviewer;
				System.out.println(this.name + ", now your reviewer is " + reviewer.name + ".");
			}
		} else {
			System.out.println(this.name + " already have a reviewer: " + this.reviewer.name);
		}
	}
	
	void setSupervisors(Lecturer lecturer, Lecturer reviewer) {
		setLecturer(lecturer);
		setReviewer(reviewer);
	}
	
	void applyToSupervisors() {
		this.lecturer.iAmLecturerTo.add(this);
		this.reviewer.iamReviewerTo.add(this);
	}
	
	void determineGrade() {
		// checks if this student has both lecturer and reviewer
		if (this.lecturer == null || this.reviewer == null) {
			System.out.println(this.name + " needs both lecturer and reviewer to determine his/her grade.");
			return;
		}
		Random r = new Random();
		int range = (this.reviewer.maxGrade + 1) - this.reviewer.minGrade;
		this.grade = r.nextInt(range) + this.reviewer.minGrade;
		if (this.lecturer.maxGrade > this.reviewer.maxGrade) {
			this.grade += 1;
		}
		if (this.grade > 10) {
			this.grade = 10;
		}
		if (this.grade < 0) {
			this.grade = 0;
		}
	}
	
	void getExamInfo() {
		int grade = this.grade;
		// if student's lecturer's 'maxGrade' was higher than this student's reviewer's 'maxGrade' then the student's final grade
		// was raised by 1 grade. So to determine if the final grade is the same as the reviewer evaluated, we need to compare
		// this student's lecturer's and reviewer's 'maxGrades'
		if (this.lecturer.maxGrade > this.reviewer.maxGrade) {
			grade -= 1;
		}
		System.out.println(this.name + " defended thesis on '" + this.project + "'. His/her supervisor was " + this.lecturer + ".\nReviewer graded " + this.name + " with " + grade + ".");
	}
	
	// determines what kind of grade the reviewer assigned to the student
	int getStudentGradeByReviewer() {
		int grade = this.grade;
		if (this.lecturer.maxGrade > this.reviewer.maxGrade) {
			grade -= 1;
		}
		return grade;
	}
	
	public String toString() {
		return this.name;
	}
	

}
