package step14;

import java.util.Scanner;

public class BOJ_1934 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		
		int[][] arr = new int[T][2];
		for(int i = 0; i < T; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}
		in.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			int min = gcd(arr[i][0], arr[i][1]);
			int result = arr[i][0] * arr[i][1] / min;
			
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		return a;
	}
}
