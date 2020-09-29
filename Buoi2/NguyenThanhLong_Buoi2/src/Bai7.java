import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String student1, student2, student3;
		int year1, year2, year3;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Tên sinh viên 1: ");
		student1 = scanner.next();
		System.out.print("Mời bạn nhập vào năm sinh: ");
		year1 = scanner.nextInt();

		System.out.print("Tên sinh viên 2: ");
		student2 = scanner.next();
		System.out.print("Mời bạn nhập vào năm sinh: ");
		year2 = scanner.nextInt();

		System.out.print("Tên sinh viên 3: ");
		student3 = scanner.next();
		System.out.print("Mời bạn nhập vào năm sinh: ");
		year3 = scanner.nextInt();

		if (year1 > year2 && year1 > year3) {
			System.out.print("Sinh viên nhỏ tuổi nhất: " + student1);
		} else if (year2 > year1 && year2 > year3) {
			System.out.print("Sinh viên nhỏ tuổi nhất: " + student2);
		} else {
			System.out.print("Sinh viên nhỏ tuổi nhất: " + student3);
		}

	}

}
