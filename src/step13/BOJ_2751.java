package step13;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2751 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i : arr) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
