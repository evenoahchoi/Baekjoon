import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int k = 0;
		
		n = sc.nextInt();
		k = sc.nextInt();
		int[] arr = new int[n];
		int[] sum = new int[n+1];
		int[] r_sum = new int[n-k+1];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		sum[0]=0;
		sum[1]=arr[0];
		for(int i=1;i<n;i++) {
			sum[i+1]=sum[i]+arr[i];
		}
	
		for(int i=0;i<n-k+1;i++) {
			r_sum[i]=sum[i+k]-sum[i];
		}

		int max = r_sum[0];
		for(int i=0;i<n-k+1;i++) {
			if(r_sum[i]>max) {
				max=r_sum[i];
			}
		}

		System.out.printf("%d",max);
		
	}

}
