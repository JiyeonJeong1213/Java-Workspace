package com.kh.practice.student.view;

import java.util.Arrays;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		Student[] sArr = ssm.printStudent();
		for(Student std : sArr) {
			System.out.println(std.inform());
		}
		System.out.println();
		System.out.println("========== 학생 성적 출력 ==========");
		double[] avg = ssm.avgScore();
		System.out.println("학생 점수 합계 : "+(int)(avg[0]));
		System.out.println("학생 점수 평균 : "+avg[1]);
		System.out.println();
		System.out.println("========== 성적 결과 출력 ==========");
		for(Student std : sArr) {
			String result = "통과";
			if(std.getScore() < ssm.Cut_Line) {
				result = "재시험 대상";
			}
			System.out.printf("%s학생은 %s입니다.\n", std.getName(), result);
		}
	}
}
