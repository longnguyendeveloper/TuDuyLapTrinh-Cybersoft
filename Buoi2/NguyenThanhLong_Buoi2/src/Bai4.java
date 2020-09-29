import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a, b, c;

		Scanner scanner = new Scanner(System.in);

		// Nhập dữ liệu 3 cạnh tam giác
		System.out.print("Nhập cạnh a: ");
		a = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập cạnh b: ");
		b = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập cạnh c: ");
		c = Float.parseFloat(scanner.nextLine());

		if (a < b + c && b < a + c && c < a + b) {
			if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
				System.out.println("Đây là tam giác vuông");
			} else if (a == b && b == c && a == c) {
				System.out.println("Đây là tam giác cân");
			} else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b) {
				System.out.println("Đây là tam giác tù");
			} else
				System.out.println("Đây là tam giác nhọn");
		} else
			System.out.println("Đây không phải là tam giác");
	}

}
