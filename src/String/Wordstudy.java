package String;
import java.util.*;

public class Wordstudy {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26];
        int max = Integer.MIN_VALUE;
        boolean isSame = true;
        char maxChar = ' ';

        String word = sc.next().toUpperCase();
        sc.close();

        for (int i = 0; i < word.length(); i++){
            int alphabetNum = word.charAt(i)-'A';
            alphabet[alphabetNum] += 1;
            
            if (alphabet[alphabetNum] > max){
                max = alphabet[alphabetNum];
                maxChar = (char) ('A' + alphabetNum);
                isSame = false;
            } else if(alphabet[alphabetNum] == max){
                isSame = true;
            }
        }

        if (isSame) System.out.println("?");
        else System.out.println(maxChar);
    }
}