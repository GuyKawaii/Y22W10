package day2;

import java.util.Arrays;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("Malik");
		
		System.out.println(Arrays.toString(s1.getGrades()));
		
		for (int i = 0; i < 7; i++) {
			s1.addGrade(12 - i);
			System.out.println(s1.getLatestGrade());
		}
		
		System.out.println(Arrays.toString(s1.getGrades()));
		
	}
}
