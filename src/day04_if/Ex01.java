package day04_if;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();
		if(num % 3 == 0) {
			System.out.println(num + "�� 3�� ���");
		} else {
			System.out.println(num + "�� 3�� ��� �ƴ�");
		}
		System.out.println("���� ����� ����");
	}

}
