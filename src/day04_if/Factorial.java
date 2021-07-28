package day04_if;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int result = fat(num);
		
		System.out.println(result);
	}
	public static int fat(int num) {
		if(num == 1) {
			return 1;
		} else {
			num = num * fat(num - 1);
			return num;
		}
	}

}
