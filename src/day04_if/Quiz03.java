package day04_if;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력해 주세요 : ");
		int age = scanner.nextInt();
		int charge;
		
		if(age < 8) {
			System.out.println("미취학 아동입니다.");
			charge = 500;
		} else if(age < 14) {
			System.out.println("어린이 입니다.");
			charge = 1000;
		} else if(age < 20) {
			System.out.println("청소년 입니다.");
			charge = 1500;
		} else {
			System.out.println("성인 입니다.");
			charge = 2000;
		}
		System.out.println("입장료는 " + charge + "원 입니다");
	}

}