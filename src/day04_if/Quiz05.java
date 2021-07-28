package day04_if;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("짜장면 수와 짬뽕 수를 입력해 주세요 : ");
		int count1 = scanner.nextInt();
		int count2 = scanner.nextInt();
		
		int sum = count1 + count2;
		int price = (count1 * 5000) + (count2 * 6000);
		
		if(sum >= 10) {
			price = price - (price * 10 / 100);
		} else if(sum >= 5) {
			price = price - (price * 5 / 100);
		}
		System.out.println("총 계산 금액은" + price + "원 입니다.");
	}

}
