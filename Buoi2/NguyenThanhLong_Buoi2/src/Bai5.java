import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month, year;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Mời bạn nhập vào tháng: ");
		month = scanner.nextInt();
		System.out.print("Mời bạn nhập vào năm: ");
		year = scanner.nextInt();

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("Tháng " + month + " Năm " + year + " có 31 ngày.");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("Tháng " + month + " Năm " + year + " có 30 ngày.");
		} else if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					/*
					 * Năm nhuận là năm chia hết cho 4. Nếu năm đó chia hết cho 100 thì cũng phải
					 * chia hết cho 400.
					 */
					System.out.println("Tháng " + month + " Năm " + year + " có 29 ngày.");
				} else {
					// Năm chia hết cho 4 và 100 nhưng không chia hết cho 400 thì không là năm
					// nhuận.
					System.out.println("Tháng " + month + " Năm " + year + " có 28 ngày.");
				}
			} else {
				// Năm chia hết cho 4 nhưng không chia hết cho 100 thì là năm nhuận.
				System.out.println("Tháng " + month + " Năm " + year + " có 29 ngày.");
			}
		} else {
			// Năm không chia hết cho 4 thì không phải là năm nhuận.
			System.out.println("Tháng " + month + " Năm " + year + " có 28 ngày.");
		}
	}
}
