package step7;

import java.util.Scanner;

public class BOJ_2738 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.nextLine();
		
		int[][] matrix = new int[n*2][m];
		
		for(int i=0; i < n*2; i++)
			for(int j=0; j < m; j++)
				matrix[i][j] = in.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < n; i++) {
			for(int j=0; j < m; j++)
				sb.append(matrix[i][j] + matrix[i+n][j] + " ");
			sb.append("\n");
		}
		System.out.println(sb);
		in.close();
	}
}
