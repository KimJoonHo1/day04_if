package day04_if;

import java.util.Scanner;

public class Ex05_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str;
		System.out.println("���ڿ� �Է�");
		str = scanner.next();
		switch(str) {
			case "�ȳ�":
				System.out.println("�ȳ��� �Է�");
				break;
			case "�׷�":
				System.out.println("�׷��� �Է�");
				break;
			
		}
		System.out.println("��������� ����");
	}

}