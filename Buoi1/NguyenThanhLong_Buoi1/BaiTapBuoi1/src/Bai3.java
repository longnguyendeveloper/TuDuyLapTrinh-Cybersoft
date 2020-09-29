import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float usdToVND;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số tiền USD muốn quy đổi sang VND: ");
		usdToVND = Float.parseFloat(scanner.nextLine());
		System.out.print("Số tiền sau khi quy đổi: " + usdToVND * 23500 + "VND");
	}

}