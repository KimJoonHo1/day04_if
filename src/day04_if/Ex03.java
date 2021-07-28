package day04_if;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = scanner.nextInt();
		if(num>100) {
			System.out.println(num + " : 100보다 크다");
		} else if(num > 50) {
			System.out.println(num + " : 50보다 크다");
		} else {
			System.out.println(num + " 50보다 작은 값들");
		}
		System.out.println("다음 문장들 실행");
	}

}
