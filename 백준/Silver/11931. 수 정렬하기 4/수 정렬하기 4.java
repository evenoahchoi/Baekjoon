import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[2000001];
		int m = 0;

		for (int i = 0; i < n; i++) {
			m = Integer.parseInt(br.readLine());
			arr[1000000+m]++;
		}

		
		for (int i = 2000000; i >= 0; i--) {
			if (arr[i] != 0) {
				if (arr[i] <= 0) {
					for (int k = 0; k < arr[i]; k++) {
						sb.append(-i-1000000).append("\n");
					}
				}else if(arr[i]>00) {
					for (int k = 0; k < arr[i]; k++) {
						sb.append(i-1000000).append("\n");
					}
				}
			}
		}
		System.out.println(sb);
	}

}

	