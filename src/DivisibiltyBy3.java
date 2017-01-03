
public class DivisibiltyBy3 {

	public static void main(String[] args) {

		int count = 0;
		for (int x = 1; x <= 1000; x++) {

			if (x % 3 == 0) {

				count++;
			}
		}
		System.out.println("total number :" + count);

	}

}
