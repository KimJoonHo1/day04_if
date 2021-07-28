package day04_if;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String home = "";
		String company = "";
		
		boolean sw = true;
		
		while(sw) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			int num = scanner.nextInt();
			switch(num) {
				case 1:
					System.out.print("우리집 목적지 입력 : ");
					home = scanner.next();
					System.out.println("등록 성공");
					break;
				case 2:
					System.out.print("회사 목적지 입력 : ");
					company = scanner.next();
					System.out.println("등록 성공");
					break;
				case 3:
					System.out.println("우리집 : " + home);
					System.out.println("회사 : " + company);
					break;
				default:
					System.out.println("잘못된 값을 입력해서 종료합니다.");
					sw = false;
			}
		}
	}

}
