package step14;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class BOJ_7785 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		
		HashMap<String, String> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			String[] input = in.nextLine().split(" ");
			map.put(input[0], input[1]);
		}
		in.close();
		
		ArrayList<String> arr = new ArrayList<>();
		for (String key: map.keySet()) {
			if(map.get(key).equals("enter"))
				arr.add(key);
		}
		
		arr.sort((o1, o2) -> o2.compareTo(o1));
		
		StringBuilder sb = new StringBuilder();
		for(String s : arr) {
			sb.append(s).append("\n");
		}
		System.out.println(sb);
	}

}
