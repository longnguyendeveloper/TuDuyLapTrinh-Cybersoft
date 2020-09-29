import java.util.Scanner;

public class Bai4_TinhGiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1, giaiThua = 1, temp = 1;
		tinhGiaiThua(a, giaiThua, temp);

	}

	private static void tinhGiaiThua(int a, int giaiThua, int temp) {
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập vào 1 số bất kỳ: ");
			a = scanner.nextInt();
		} while ((a <= 0) || (a > 10));

		while (temp <= a) {
			giaiThua *= temp;
			temp++;
		}

		System.out.println(a + "! = " + giaiThua);
	}

}