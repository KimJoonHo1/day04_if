package day04_if;

import java.util.Scanner;

public class Ex05_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str;
		System.out.println("문자열 입력");
		str = scanner.next();
		switch(str) {
			case "안녕":
				System.out.println("안녕을 입력");
				break;
			case "그래":
				System.out.println("그래를 입력");
				break;
			
		}
		System.out.println("다음문장들 실행");
	}

}
