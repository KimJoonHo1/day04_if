package day04_if;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("��¥ �Է� : ");
		int num = scanner.nextInt();
		
		switch(num % 7) {
			case 1:
				System.out.println("������");
				break;
			case 2:
				System.out.println("ȭ����");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("�����");
				break;
			case 5:
				System.out.println("�ݿ���");
				break;
			case 6:
				System.out.println("�����");
				break;
			case 7:
				System.out.println("�Ͽ���");
				break;
		}
	}

}
