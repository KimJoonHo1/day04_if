package day04_if;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("�� �Է� : ");
		num = scanner.nextInt();
		if(num>100) {
			System.out.println(num + " : 100���� ũ��");
		} else if(num > 50) {
			System.out.println(num + " : 50���� ũ��");
		} else {
			System.out.println(num + " 50���� ���� ����");
		}
		System.out.println("���� ����� ����");
	}

}
