package chap07.homework01;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Student[] stu = {
		new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과"),
		new Student("이영희", 23, 167.0, 54.0, 4, "물리학과"),
		new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과")};
		
		for(int i = 0; i < stu.length; i ++) {
			System.out.println(stu[i].toString());
		}
		
		Employee[] emp = new Employee[10];
		
		// 생성될 배열 개수
		int x = 0;
		
		System.out.println("=== 사원 입력받기 ===");
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.print("부서 : ");
		String dept = sc.nextLine();
		
		emp[x] = new Employee(name, age, height, weight, salary, dept);
		
		System.out.println("계속 추가하시겠습니까?");
		String again = sc.nextLine();
		if ("n".equalsIgnoreCase(again)) {
			break;
		} 
		x++;
		}
		
		for(int i = 0; i <= x; i ++) {
			System.out.println(emp[i].toString());
		}
	}	
}
