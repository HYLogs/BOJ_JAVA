package step14;

import java.util.Scanner;
import java.util.HashMap;

public class BOJ_1620 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		String[] arr = new String[N];
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String s = in.next();
			arr[i] = s;
			map.put(s, i + 1);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			String s = in.next();
			if (map.containsKey(s)) {
				sb.append(map.get(s));
			}
			else {
				int index = Integer.parseInt(s) - 1;
				sb.append(arr[index]);
			}
			sb.append("\n");
		}
		in.close();
		
		System.out.println(sb);
	}
}
