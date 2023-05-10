package step10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_1085 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
		in.close();
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(w-x);
		arr.add(h-y);
		arr.add(x);
		arr.add(y);
		
		System.out.println(Collections.min(arr));
		
	}
}
