import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int n, cnt = 0;
		int remainder;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Given number is:" + n);
		System.out.println("Reverse: ");
		int arr[] = new int[20];
		while (n != 0) {
			remainder = n % 10;
			n = n / 10;
			arr[cnt] = remainder;
			cnt++;
		}

		for (int i = 0; i < cnt; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
