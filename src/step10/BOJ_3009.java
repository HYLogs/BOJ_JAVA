package step10;

import java.util.Scanner;
import java.util.ArrayList;

public class BOJ_3009 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> Xarr = new ArrayList<>();
		ArrayList<Integer> Yarr = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			addremoveArrayList(Xarr, x);
			addremoveArrayList(Yarr, y);
		}
		
		in.close();
		
		System.out.println(Xarr.get(0) + " " + Yarr.get(0));
		
	}
	
	static void addremoveArrayList(ArrayList<Integer> arr, int input) {
		if (arr.contains(input)) {
			arr.remove(arr.indexOf(input));
		} else {
			arr.add(input);
		}
	}
}
