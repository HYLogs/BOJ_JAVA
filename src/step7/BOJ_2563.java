package step7;

import java.util.Scanner;

public class BOJ_2563 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		in.nextLine();
		
		int n = 100;
		int[][] paper = new int[n][n];
		for (int i = 0; i < count; i++) {
			String[] input = in.nextLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			for (int y_gap = 0; y_gap < 10; y_gap++) {
				for (int x_gap = 0; x_gap < 10; x_gap++)
					paper[y+y_gap][x+x_gap] = 1;
			}
		}
		
		int sum = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				sum += paper[i][j];
		
		System.out.println(sum);
		in.close();
	}
}
