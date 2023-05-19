package step13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_1427 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] arr = in.nextLine().split("");
		Arrays.sort(arr, Collections.reverseOrder());
		in.close();
		
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s);
		}
		
		System.out.println(sb);
	}
}
