package step13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_11651 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}
		in.close();
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) return o1[0] - o2[0];
				
				return o1[1] - o2[1];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for (int[] i : arr) {
			sb.append(i[0]).append(" ").append(i[1]);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
