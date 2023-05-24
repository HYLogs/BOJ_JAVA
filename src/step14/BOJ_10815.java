package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class BOJ_10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//상근이가 가지고 있는 카드 HashSet으로 입력 받기
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		HashSet<String> cards = new HashSet<>();
		for (int i = 0; i < N; i++) {
			cards.add(st1.nextToken());
		}
		
		//비교할 카드 ArrayList로 입력 받기
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		ArrayList<String> arrCards = new ArrayList<>();;
		for (int i = 0; i < M; i++) {
			arrCards.add(st2.nextToken());
		}
		
		//교집합으로 중복된 것만 걸러내기
		HashSet<String> compareCards = new HashSet<>(arrCards);
		cards.retainAll(compareCards);
		
		//비교할 카드(compareCards) 값 0으로 설정
		HashMap<String, Integer> map = new HashMap<>();
		for (String s : compareCards) {
			map.put(s, 0);
		}
		
		//중복된 값 1로 설정
		for (String s : cards) {
			map.put(s, 1);
		}
		
		//출력
		StringBuilder sb = new StringBuilder();
		for (String s : arrCards) {
			sb.append(map.get(s));
			sb.append(" ");
		}
		
		System.out.println(sb);
	}
}
