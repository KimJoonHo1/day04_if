package day04_if;

import java.util.Scanner;

public class Ex06_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("이름 입력 : ");
			String name = scanner.next();
			System.out.println("당신의 이름은 " + name + "입니다.");
		}
	}

}
