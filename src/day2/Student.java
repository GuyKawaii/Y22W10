package day2;

public class Student {
	private final String name;
	private int[] grades;
	private int gradeIndex;
	private final int[] gradesLegal = {-3, 0, 2, 4, 7, 10, 12};
	
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
		if (this.gradeIndex == -1) {
			return 0;
		}
		
		return this.grades[this.gradeIndex];
	}
	
	void addGrade(int grade) {
		for (int gradeLegal:gradesLegal) {
			
			if ((gradeLegal == grade) && (this.gradeIndex + 1 < this.grades.length)) {
				this.gradeIndex += 1;
				this.grades[this.gradeIndex] = grade;
				
				return;
			}
		}
		
	}
	
}
