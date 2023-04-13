	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner in = new Scanner(System.in);
			StringBuilder sb = new StringBuilder();

			int n = 0;
			int m = 0;
			int i = 0;
			int j = 0;

			n = in.nextInt();
			m = in.nextInt();
			int[] arr = new int[n + 1];
			int[] sum_arr = new int[n + 1];
			int[] hap = new int[n + 1];
			int sum = 0;

			for (int k = 1; k <= n; k++) {
				arr[k] = in.nextInt();
				sum += arr[k];
				sum_arr[k] = sum;
			}

			for (int k = 0; k < m; k++) {
				i = in.nextInt();
				j = in.nextInt();
				sb.append((sum_arr[j] - sum_arr[i - 1])+"\n");
			}
			System.out.println(sb);
		}

	}