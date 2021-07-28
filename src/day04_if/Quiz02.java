package day04_if;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력해주세요 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int sum = num1 + num2 + num3;
		if(sum >= 100) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
	}

}
