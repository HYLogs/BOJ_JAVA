package step13;

import java.util.Scanner;
import java.util.Arrays;

public class BOJ_10814 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[][] arr = new String[N][2];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = in.next();
			arr[i][1] = in.next();
		}
		in.close();
		
		Arrays.sort(arr, (o1, o2) -> Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]));
		
		
		StringBuilder sb = new StringBuilder();
		
		for (String[] s: arr) {
			sb.append(s[0]).append(" ").append(s[1]);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
