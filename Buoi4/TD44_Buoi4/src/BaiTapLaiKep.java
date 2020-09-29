import java.util.Scanner;

public class BaiTapLaiKep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soTienGui = 100_000_000, tongTien, soTienMongMuon = 400_000_000;
		int soNamGui = 0;
		int laiSuat = 7;

		Scanner scanner = new Scanner(System.in);

		for (; soTienGui < soTienMongMuon; soNamGui++) {
			soTienGui += (int) ((float) soTienGui * laiSuat) / 100;

		}
		System.out.println(soNamGui);

	}

}
