import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		int c = sc.nextInt();
		double[] stu = new double[c];
		
		for(int k=0;k<c;k++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			double avg = sum / n;
			for (int i = 0; i < n; i++) {
				if (arr[i] > avg) {
					cnt += 1;
				}
			}
			stu[k] = (cnt * 100f / n);
			sum=0;
			cnt=0;
		}	//System.out.printf("%5.3f%%", (cnt * 100f / n));
		for(int i=0;i<c;i++) {
		System.out.printf("%5.3f%%",stu[i]);
		System.out.println();
		}
	}

}