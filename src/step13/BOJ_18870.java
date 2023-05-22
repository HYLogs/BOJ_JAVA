package step13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ_18870 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		
		int[] tmp_arr = arr.clone();
		
		Arrays.sort(tmp_arr);
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i : tmp_arr) {
			if (map.containsKey(i) == false)
				map.put(i, count++);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			sb.append(map.get(i)).append(" ");
		}
		System.out.println(sb);
		
	}

}
