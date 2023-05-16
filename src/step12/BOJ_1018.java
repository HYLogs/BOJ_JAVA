package step12;

import java.util.Scanner;

public class BOJ_1018 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.nextLine();
		
		String[][] metrix = new String[n][m];
		int[][] W_metrix = new int[n][m];
		int[][] B_metrix = new int[n][m];
		
		
		
		for (int i = 0; i < n; i++) {
			metrix[i] = in.nextLine().split("");
		}
		in.close();
		
		W_metrix = countMetrix(metrix, n, m, 0);
		B_metrix = countMetrix(metrix, n, m, 1);
		
		int W_min = min_change(n, m, W_metrix);
		int B_min = min_change(n, m, B_metrix);
		
		int result = Math.min(W_min, B_min);
		
		System.out.println(result);
		
	}
	
	public static int min_change(int n, int m, int[][] X_metrix) {
		int min = 64;
		
		for (int i = 0; i <= n-8; i++) {
			for (int j = 0; j <= m-8; j++) {
				int tem = 0;
				
				for (int k = 0; k < 8; k++) {
					for(int l = 0; l < 8; l++) {
						tem += X_metrix[i+k][j+l];
					}
				}
				
				if (tem < min) min = tem;
			}
		}
		
		return min;
		
	}
	
	public static int[][] countMetrix(String[][] arr, int n, int m, int reverse){
		String[] WB = new String[] {"W", "B"};
		int[][] X_arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!WB[(i+j+reverse)%2].equals(arr[i][j]) ) {
					X_arr[i][j]++;
				}
			}
		}
		
		return X_arr;
	}
}
