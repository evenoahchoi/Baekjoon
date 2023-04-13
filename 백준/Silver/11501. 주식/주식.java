import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(st.nextToken());
		
		for(int k=0;k<t;k++) {
		st = new StringTokenizer(br.readLine());	
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = arr[n - 1];
		int pro = 0;
		long hap = 0;
		for (int i = n - 1; i > 0; i--) {
			if (arr[i - 1] > max) {
				max = arr[i - 1];
			} else {
				pro = max - arr[i - 1];
				hap = hap + pro;
			}
		}
		sb.append(hap);
		sb.append("\n");
		}
		System.out.print(sb);
	}

}
