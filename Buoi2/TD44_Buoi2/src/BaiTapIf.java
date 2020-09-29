import java.util.Scanner;

public class BaiTapIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Viết chương trình cho người dùng nhập vào một số nguyên Nếu người dùng nhập
		 * số âm thì chuyển thành số dương và in ra lại màn hình
		 * 
		 * Vd: nhập -5 -> in ra màn hình 5 nhập 10 -> in ra màn hình 10
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số nguyên: ");
		int soNguyen = Integer.parseInt(scanner.nextLine());

		if (soNguyen < 0) {
			System.out.println("Số dương là: " + soNguyen * (-1));
		} else
			System.out.println(soNguyen);

	}

}
