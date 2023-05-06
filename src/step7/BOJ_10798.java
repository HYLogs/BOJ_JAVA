package step7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.ArrayList;

public class BOJ_10798 {
	public static void main(String[] args) throws FileNotFoundException {
		// input .txt file
		System.setIn(new FileInputStream("src/input.txt"));
		
		Scanner in = new Scanner(System.in);
		ArrayList<String[]> list = new ArrayList<>();

		int c_max = Integer.MIN_VALUE;

		while(in.hasNextLine()) {
			String[] input = in.nextLine().split("");
			if (c_max < input.length)
				c_max = input.length;
			list.add(input);
		}
		in.close();
		
		
		StringBuilder sb = new StringBuilder();
		
		for (int c = 0; c < c_max; c++) {
			for (int r = 0; r < list.size(); r++) {
				if (list.get(r).length <= c) continue;
				sb.append(list.get(r)[c]);
			}
		}
		
		System.out.println(sb);
	}
}
