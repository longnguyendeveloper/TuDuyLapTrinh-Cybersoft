import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số ngày làm: ");
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vn","VND"));
		System.out.println("Tổng tiền lương = " + nf.format(Integer.parseInt(scanner.nextLine())*100000));
	}

}
