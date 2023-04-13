import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];

		for (int i = 0; i < n; i++) {

			arr[Integer.parseInt(br.readLine())]++;

		}

		
		for (int i = 0; i < 10001; i++) {
			if (arr[i] != 0) {
				for (int k = 0; k < arr[i]; k++) {
					sb.append(i).append("\n");
				}
			}
		}
		System.out.println(sb);
	}

}
