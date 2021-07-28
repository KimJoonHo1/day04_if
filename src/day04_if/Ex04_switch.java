package day04_if;

import java.util.Scanner;

public class Ex04_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int select;
		System.out.print("수 입력 : ");
		select = scanner.nextInt();
		switch(select) {
			case 1:
				System.out.println("1.입력값 : " + select);
				
			case 2:
				System.out.println("2.입력값 : " + select);
				
			case 3:
				System.out.println("3.입력값 : " + select);
				
			default:
				System.out.println("1, 2, 3을 제외한 다른 값 입력");
		}
	}

}
