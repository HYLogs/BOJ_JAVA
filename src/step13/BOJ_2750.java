package step13;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2750 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			arr.add(in.nextInt());
		}
		in.close();
		
		Collections.sort(arr);
		StringBuilder sb = new StringBuilder();
		
		for (int i : arr) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}

}
