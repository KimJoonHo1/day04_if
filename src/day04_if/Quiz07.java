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
			System.out.println("1.�츮�� ���");
			System.out.println("2.ȸ�� ���");
			System.out.println("3.��� ����");
			int num = scanner.nextInt();
			switch(num) {
				case 1:
					System.out.print("�츮�� ������ �Է� : ");
					home = scanner.next();
					System.out.println("��� ����");
					break;
				case 2:
					System.out.print("ȸ�� ������ �Է� : ");
					company = scanner.next();
					System.out.println("��� ����");
					break;
				case 3:
					System.out.println("�츮�� : " + home);
					System.out.println("ȸ�� : " + company);
					break;
				default:
					System.out.println("�߸��� ���� �Է��ؼ� �����մϴ�.");
					sw = false;
			}
		}
	}

}
