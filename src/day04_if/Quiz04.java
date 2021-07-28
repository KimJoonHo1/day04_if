package day04_if;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int num = scanner.nextInt();
		if(num < 40) {
			System.out.println("40보다 작은 수");
		} else if(num>=40 && num<=60) {
			System.out.println("40~60을 포함하는 수");
		} else {
			System.out.println("60보다 큰 수");
		}
	}

}
