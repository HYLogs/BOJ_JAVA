package step14;

import java.util.HashSet;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_14425  {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		HashSet<String> S = new HashSet<>();
		for (int i = 0; i < N; i++) {
			S.add(br.readLine());
		}
		
		int count = 0;
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if (S.contains(s)) count++;
		}
		br.close();
		
		System.out.println(count);
	}
}
