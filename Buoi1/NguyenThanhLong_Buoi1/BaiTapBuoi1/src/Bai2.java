import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tinhTB = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số thứ nhất: ");
		tinhTB += Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập số thứ hai: ");
		tinhTB += Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập số thứ ba: ");
		tinhTB += Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập số thứ tư: ");
		tinhTB += Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập số thứ năm: ");
		tinhTB += Integer.parseInt(scanner.nextLine());
		System.out.println("Giá trị TB của 5 số đã nhập = " + tinhTB / 5);
	}

}
