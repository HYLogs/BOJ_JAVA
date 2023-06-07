package step14;

import java.util.Scanner;
import java.util.HashSet;

public class BOJ_1269 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		HashSet<Integer> setA = new HashSet<>();
		for (int i = 0; i < n; i++) {
			setA.add(in.nextInt());
		}
		
		HashSet<Integer> setB = new HashSet<>();
		for (int i = 0; i < m; i++) {
			setB.add(in.nextInt());
		}
		in.close();
		
		HashSet<Integer> A = (HashSet<Integer>) setA.clone();
		HashSet<Integer> B = (HashSet<Integer>) setB.clone();
		
		A.removeAll(setB);
		B.removeAll(setA);
		
		System.out.println(A.size() + B.size());
	}
}
