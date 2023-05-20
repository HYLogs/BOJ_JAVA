package step13;

import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BOJ_1181 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		HashSet<String> hs = new HashSet<>();
		
		for (int i = 0; i < N; i++) {
			hs.add(in.next());
		}
		in.close();
		
		List<String> arr = new ArrayList<>(hs);
		
		Collections.sort(arr, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) 
					return o1.compareTo(o2);
				return o1.length() - o2.length();
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s).append("\n");
		}
		
		System.out.println(sb);
	}

}
