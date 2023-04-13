import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[2];
		
		for (int i = 0; i < 2; i++) {
			int temp = sc.nextInt();
			a[i] = temp;
		}
		
		int h = a[0];
		int m = a[1];
		
		
		if(m>=45) {
			m=m-45;
		}else {
			h=h-1;
			m=60-(45-m);
		}
		
		if(h<0) {
			h=23;
		}
		
		if(m==60) {
			m=0;
		}
		System.out.printf("%d %d",h,m);
	}

}