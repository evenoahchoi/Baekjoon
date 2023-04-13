
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());

		int[] a = new int[n];

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(st.nextToken());
			list.add(a[i]);
		}
		

		Collections.sort(list, Collections.reverseOrder());

		int temp = 0;
		for (int i = 0; i < n-2; i++) {

			if (list.get(i) < (list.get(i + 1) + list.get(i + 2))) {
				temp = list.get(i) + list.get(i + 1) + list.get(i + 2);
				System.out.println(temp);
				break;
			}
			
		}
		if(temp==0) {
				System.out.println(-1);
			}
	}
}