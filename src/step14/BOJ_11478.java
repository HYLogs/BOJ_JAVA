package step14;
import java.util.HashSet;
import java.util.Scanner;

public class BOJ_11478 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		HashSet<String> set = new HashSet<>();
		
		for(int i = 0; i < input.length(); i++) {
			for(int j = 0; j < input.length() - i; j++) {
				String tmp = input.substring(j, j+i+1);
				set.add(tmp);
			}
		}
		in.close();
		
		System.out.println(set.size());
	}
}
