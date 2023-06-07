package step14;

import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_1764 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		HashSet<String> set_N = new HashSet<>();
		for (int i=0; i < N; i++) {
			set_N.add(in.next());
		}
		
		HashSet<String> set_M = new HashSet<>();
		for (int i=0; i < M; i++) {
			set_M.add(in.next());
		}
		in.close();
		
		set_N.retainAll(set_M);
		ArrayList<String> arr = new ArrayList<>(set_N);
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr.size()).append("\n");
		for (String s : arr) {
			sb.append(s).append("\n");
		}
		
		System.out.println(sb);
		
		
	}

}
