package day04_if;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ��� : ");
		int num = scanner.nextInt();
		if(num < 40) {
			System.out.println("40���� ���� ��");
		} else if(num>=40 && num<=60) {
			System.out.println("40~60�� �����ϴ� ��");
		} else {
			System.out.println("60���� ū ��");
		}
	}

}
