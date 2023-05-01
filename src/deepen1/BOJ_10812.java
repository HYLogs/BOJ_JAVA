package deepen1;

import java.util.Scanner;
import java.util.ArrayList;

public class BOJ_10812 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(i+1);
		}
		
		for (int count = 0; count < m; count++) {
			input = in.nextLine().split(" ");
			int i = Integer.parseInt(input[0]);
			int j = Integer.parseInt(input[1]);
			int k = Integer.parseInt(input[2]);
			
			int mid = list.get(k-1);
			
			while (list.get(i-1) != mid) {
				int temp = list.remove(i-1);
				list.add(j-1, temp);
			}
		}
		
		
		ArrayList<String> result = new ArrayList<String>();
		for (Integer integer : list) {
			result.add(String.valueOf(integer));
		}
		
		System.out.println(String.join(" ", result));
		
	}
}
