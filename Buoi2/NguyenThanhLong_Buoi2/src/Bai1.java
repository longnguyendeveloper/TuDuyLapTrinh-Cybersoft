import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float soThuc1, soThuc2, soThuc3;

		Scanner scanner = new Scanner(System.in);

		// Nhập dữ liệu 3 số thực
		System.out.print("Nhập số thứ nhất: ");
		soThuc1 = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập số thứ hai: ");
		soThuc2 = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập số thứ ba: ");
		soThuc3 = Float.parseFloat(scanner.nextLine());

		if (soThuc1 < 0) {
			soThuc1 *= -1;
			System.out.println("Trị tuyệt đối của số thứ nhất = " + soThuc1);
		} else {
			System.out.println("Trị tuyệt đối của số thứ nhất = " + soThuc1);
		}

		if (soThuc2 < 0) {
			soThuc2 *= -1;
			System.out.println("Trị tuyệt đối của số thứ hai = " + soThuc2);
		} else {
			System.out.println("Trị tuyệt đối của số thứ hai = " + soThuc2);
		}

		if (soThuc3 < 0) {
			soThuc3 *= -1;
			System.out.println("Trị tuyệt đối của số thứ ba = " + soThuc3);
		} else {
			System.out.println("Trị tuyệt đối của số thứ ba = " + soThuc3);
		}

	}

}
