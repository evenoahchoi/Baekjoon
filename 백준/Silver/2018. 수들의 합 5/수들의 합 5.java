import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] sum = new int[n+2];
		int count = 0;
	
		sum[0]=0;
		sum[1]=1;
		
		for(int i=1;i<=n;i++) {
			sum[i+1]=sum[i]+i+1;
		}
		for (int i = ((n+1)/2); i > 1; i--) {
			for (int k = 2; k <=i; k++) {
				int j = (sum[i] - sum[i - k]);
				if(j>n) {
					break;
				}
				//System.out.println(j);
				if(j==n) {
					count+=1;
                    break;
				}  
				
			}
		}

		System.out.println(count + 1);
	}

}
