package deepen1;

import java.util.Scanner;
import java.util.HashMap;

public class BOJ_25206 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Double> subjectMap = new HashMap<String, Double>(){{
			put("A+", 4.5);
			put("A0", 4.0);
			put("B+", 3.5);
			put("B0", 3.0);
			put("C+", 2.5);
			put("C0", 2.0);
			put("D+", 1.5);
			put("D0", 1.0);
			put("F", 0.0);
			put("P", -1.0);
		}};
		
		Double sum = 0.0, totalScore = 0.0; 
		Double score, subjectGrade;
		while (in.hasNextLine()) {
			String[] input = in.nextLine().split(" ");
			score = Double.parseDouble(input[1]);
			subjectGrade = subjectMap.get(input[2]);
			
			if (subjectGrade >= 0.0) {
				sum += score * subjectGrade;
				totalScore += score;
			}
		}
		
		in.close();
		System.out.printf("%.6f", sum/totalScore);
	}
}
