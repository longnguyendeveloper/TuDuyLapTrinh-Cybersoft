import java.util.Scanner;

public class BaiTapSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Bài tập switch case Viết chương trình cho người dùng nhập vào tháng trong năm
		 * Nếu tháng không hợp lệ in ra "Tháng không hợp lệ!" Nếu tháng hợp lệ in số
		 * ngày trong tháng. (không cần xét năm nhuận)
		 * 
		 */

		int month;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tháng: ");
		month = Integer.parseInt(scanner.nextLine());

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + " có 31 ngày.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + " có 30 ngày.");
			break;
		case 2:
			System.out.println(month + " có 28/29 ngày.");
			break;
		default:
			System.out.println(month + " không hợp lệ.");
		}

	}

}
