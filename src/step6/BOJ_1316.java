package step6;
import java.util.*;

public class BOJ_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        int groupWordCount = 0;

        for (int i = 0; i < size; i++){
            boolean[] check = new boolean[26];
            String word = sc.nextLine();
            for (int j = 0; j < word.length(); j++){
                if (check[word.charAt(j)-'a'] == true) break;
                if (j+1 == word.length()){
                    groupWordCount += 1;
                    break;
                }
                if (word.charAt(j) != word.charAt(j+1)){
                    check[word.charAt(j)-'a'] = true;
                }
            }
        }
        sc.close();
        System.out.println(groupWordCount);
    }
}
