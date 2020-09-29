import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String student1, student2, student3;
		int so1, so2, so3, countChan = 0, countLe = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số thứ 1: ");
		so1 = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập số thứ 2: ");
		so2 = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập số thứ 3: ");
		so3 = Integer.parseInt(scanner.nextLine());
		if (so1 % 2 == 0) {
			System.out.println(so1 + " là số chẵn!");
			countChan++;
		} else {
			System.out.println(so1 + " là số lẻ!");
			countLe++;
		}
		if (so2 % 2 == 0) {
			System.out.println(so2 + " là số chẵn!");
			countChan++;
		} else {
			System.out.println(so2 + " là số lẻ!");
			countLe++;
		}
		if (so3 % 2 == 0) {
			System.out.println(so3 + " là số chẵn!");
			countChan++;
		} else {
			System.out.println(so3 + " là số lẻ!");
			countLe++;
		}
		System.out.println("Có tổng cộng " + countChan + " số chẵn và " + countLe + " số lẻ");

	}

}
