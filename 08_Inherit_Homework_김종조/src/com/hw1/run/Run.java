package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[3];
		
		s[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		s[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		s[2] = new Student("감개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(Student std : s) {
			System.out.println(std.information());
		}
		
		Employee[] e = new Employee[10];
		int count = 0;
		
		while(true) {
			System.out.println("사원을 추가하시겠습니까? (Y / N)");
			char answer = sc.next().charAt(0);
			
			if(answer == 'n' || answer == 'N') {
				System.out.println("종료...");
				break;
			}else if(answer == 'y' || answer == 'Y') {
				if(count == e.length) {
					System.out.println("사원이 꽉 찼습니다.");
					break;
				}
				System.out.print("이름 입력 : ");
				String name = sc.next();
				
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				
				System.out.print("신장 입력 : ");
				double height = sc.nextDouble();
				
				System.out.print("몸무게 입력 : ");
				double weight = sc.nextDouble();
				
				System.out.print("급여 입력 : ");
				int salary = sc.nextInt();
				
				System.out.print("부서 입력 : ");
				String dept = sc.next();
				
				e[count] = new Employee(name, age, height, weight, salary, dept);
				count++;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			

		}
		
		for(Employee emp : e) {
			if(emp == null) {
				break;
			}
			System.out.println(emp.information());
		}
	}
}
