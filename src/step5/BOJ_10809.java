package step5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_10809 {
    public static void main(String[] args) throws Exception {
        List<String> result = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        for(char i = 'a'; i < 'a'+26; i++){
            result.add(String.valueOf(S.indexOf(i)));
        }
        System.out.println(String.join(" ", result));
        sc.close();
    }
}
