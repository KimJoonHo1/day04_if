package day04_if;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("���̸� �Է��� �ּ��� : ");
		int age = scanner.nextInt();
		int charge;
		
		if(age < 8) {
			System.out.println("������ �Ƶ��Դϴ�.");
			charge = 500;
		} else if(age < 14) {
			System.out.println("��� �Դϴ�.");
			charge = 1000;
		} else if(age < 20) {
			System.out.println("û�ҳ� �Դϴ�.");
			charge = 1500;
		} else {
			System.out.println("���� �Դϴ�.");
			charge = 2000;
		}
		System.out.println("������ " + charge + "�� �Դϴ�");
	}

}