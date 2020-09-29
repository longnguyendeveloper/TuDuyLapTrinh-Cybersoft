
public class DemoPhepTangGiam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soA = 5;
		int soB = 4;
		int soC = soA++;

		soB += soA;
		soC--;
		soA = soC--;

		System.out.println(soA + "," + soB + "," + soC);
	}

}
