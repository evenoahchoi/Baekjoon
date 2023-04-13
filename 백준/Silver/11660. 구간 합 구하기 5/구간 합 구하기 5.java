import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);	
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n+1][n+1];
		int[][] sum = new int[n+1][n+1];
		
		
		for(int x = 1; x<=n;x++) {
			for(int y = 1;y<=n;y++) {
				arr[x][y]=sc.nextInt();
			}
		}
		for(int x = 1; x<=n;x++) {
			for(int y = 1;y<=n;y++) {
				sum[x][y] = sum[x][y-1] + sum[x-1][y] - sum[x-1][y-1]+ arr[x][y];
			}
		}

		for(int i=0;i<m;i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			sb.append((sum[x2][y2]-sum[x2][y1-1]-sum[x1-1][y2]+sum[x1-1][y1-1])+"\n");
		}
		
		System.out.println(sb);
	}

}