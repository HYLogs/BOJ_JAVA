package step14;

import java.util.Scanner;
import java.util.HashMap;

public class BOJ_10816 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); in.nextLine();
		String[] arr_N = in.nextLine().split(" ");
		int M = in.nextInt(); in.nextLine();
		String[] arr_M = in.nextLine().split(" ");
		in.close();
		
		
		HashMap<String, Integer> map = new HashMap<>();
		for (String s : arr_N) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		
		StringBuilder sb = new StringBuilder();
		for (String s : arr_M) {
			if (map.containsKey(s)) {
				sb.append(map.get(s));
			} else {
				sb.append(0);
			}
			sb.append(" ");
		}
		
		System.out.println(sb);
	}
}
