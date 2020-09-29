package cybersoft.td44;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Demo đối tượng
		 */

		/*
		 * NhanVien nhanVien; nhanVien = new NhanVien(); nhanVien.tinhLuong();
		 * 
		 * SinhVien sinhVien; sinhVien = new SinhVien();
		 */

		Scanner scanner = new Scanner(System.in);
		XeBus xeBus = new XeBus("59-N9-333.33", (byte) 50);
		xeBus.nhapThongTin(scanner);
		xeBus.inThongTin();
		
		

	}

}
