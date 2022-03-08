package day2;

public class Student {
	private final String name;
	private final int[] grades;
	private int gradeIndex;
	
	Student(String name) {
		this.name = name;
		this.grades = new int[7];
		this.gradeIndex = -1;
	}
	
	int[] getGrades() {
		return this.grades;
	}
	
	String getName() {
		return this.name;
	}
	
	int getLatestGrade() {
		return this.grades[this.gradeIndex];
	}
	
	void addGrade(int grade) {
		if (this.gradeIndex + 1 < this.grades.length) {
			this.gradeIndex += 1;
			this.grades[this.gradeIndex] = grade;
		}
	}
	
}
