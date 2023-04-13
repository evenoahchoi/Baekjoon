import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();


		int[][] arr = new int[101][101];
	
		int[] xy = new int[2];

	
		for (int i = 1; i < 101; i++) {
			for (int k = 1; k < 101; k++) {
				arr[i][k] = 0;
			}
		}

		for (int s = 0; s < n; s++) {
			
			for (int i = 0; i < 2; i++) {
				int temp = sc.nextInt();
				xy[i] = temp;
			}
			
			for (int i = 0; i < 10; i++) {
				for (int k = 0; k < 10; k++) {
					arr[101 - (xy[1] + k)][xy[0] + i] = 1;
				}
			}
		}

	
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			for (int k = 1; k < 101; k++) {
				sum = sum + arr[i][k];
			}
		}
		System.out.println(sum);
	}

}