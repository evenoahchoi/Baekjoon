import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = 0;
		n = sc.nextInt();
		int[][] arr = new int[n + 2][3];
	
		int cnt = 0;


		for (int i = 1; i < n + 1; i++) {
			for (int k = 1; k < 3; k++) {
				arr[i][k] = sc.nextInt();
			}
		}

		for (int i = 1; i < n + 1; i++) {
			for (int k = 1; k < n + 1; k++) {
				if (arr[k][1] > arr[i][1] && arr[k][2] > arr[i][2]) {
					cnt++;
				}
			}
			System.out.printf("%d ",cnt + 1);
			cnt = 0;
		}
	}
}
