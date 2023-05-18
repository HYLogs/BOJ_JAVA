package step13;

import java.util.Scanner;
import java.util.Arrays;

public class BOJ_25305 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length - k]);
	}
}
