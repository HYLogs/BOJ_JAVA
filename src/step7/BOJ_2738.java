package step7;

import java.util.Scanner;

public class BOJ_2738 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.nextLine();
		
		int[][] Amatrix = new int[n][m];
		int[][] Bmatrix = new int[n][m];
		
		for(int i=0; i < n; i++)
			for(int j=0; j < m; j++)
				Amatrix[i][j] = in.nextInt();
		for(int i=0; i < n; i++)
			for(int j=0; j < m; j++)
				Bmatrix[i][j] = in.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < n; i++) {
			for(int j=0; j < m; j++)
				sb.append(Amatrix[i][j] + Bmatrix[i][j] + " ");
			sb.append("\n");
		}
		System.out.println(sb);
		in.close();
	}
}
