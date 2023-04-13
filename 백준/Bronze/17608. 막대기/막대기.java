import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		int count = 1;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int k = n - 1; k > 0; k--) {
			if (arr[k - 1] > arr[n-1]) {
				count += 1;
				n=k;
			}

		}

		System.out.printf("%d", count);

	}

}