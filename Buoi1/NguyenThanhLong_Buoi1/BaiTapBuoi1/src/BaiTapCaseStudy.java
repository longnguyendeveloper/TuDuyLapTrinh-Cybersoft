import java.util.Scanner;

public class BaiTapCaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ý tưởng: 
		//số cây trồng đc = chiều dài sân / (bán kính cây + không gian giữa 2 cây)

		Scanner scanner = new Scanner(System.in);
		// khai báo biến
		float chieuDaiSan, soCayTrong, banKinhCay, khongGianCanThiet, tongDatSuDung;
		int soCay;

		// input chiều dài sân
		System.out.print("Nhập chiều dài của sân: ");
		chieuDaiSan = Float.parseFloat(scanner.nextLine());

		// input bán kính cây
		System.out.print("Nhập bán kính cây: ");
		banKinhCay = Float.parseFloat(scanner.nextLine());

		// input khoảng cách 2 cây
		System.out.print("Nhập khoảng cách cần thiết: ");
		khongGianCanThiet = Float.parseFloat(scanner.nextLine());
		
		//Tổng chiều rộng cây = Bán kính * 2
		tongDatSuDung = banKinhCay * 2 + khongGianCanThiet;
		int soCayTrongDuoc = Math.round(chieuDaiSan / tongDatSuDung) ;

		System.out.println("Số cây trồng được = " + soCayTrongDuoc);
		System.out.println("Tổng không gian cây chiếm = " + banKinhCay * 2);

	}

}
