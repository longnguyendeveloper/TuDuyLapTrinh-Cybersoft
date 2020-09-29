import java.util.Scanner;

public class BaiTapTheTinDung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* bài tập của tui
		float soDuThe, soThanhToan, soTienNo;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số dư thẻ: ");
		soDuThe = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập số tiền đã thanh toán: ");
		soThanhToan = Float.parseFloat(scanner.nextLine());

		if (soThanhToan < soDuThe) {
			soTienNo = soDuThe - soThanhToan;
			System.out.println("Tiền phạt 1.5% là = " + soTienNo * (1.5 / 100));
		} else
			System.out.println("Tiền phạt = 0");
			*/
		
		/*
		 * Bài tập sửa: Credit Card
		 */
		Scanner scanner = new Scanner(System.in);
		float creditCardBalance, payment, balance, penalty = 0;
		
		System.out.print("Credit Card Balance: ");
		creditCardBalance = Float.parseFloat(scanner.nextLine());
		
		System.out.print("Payment Amount: ");
		payment = Float.parseFloat(scanner.nextLine());
		
		balance = payment - creditCardBalance;
		
		if(balance > 0) {
			penalty = balance * 1.5f / 100;
		}
		
		System.out.println("Penalty you need to pay: " + penalty);

	}

}
