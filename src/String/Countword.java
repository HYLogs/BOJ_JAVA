package String;

import java.util.*;

public class Countword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrWords = sc.nextLine().split(" ");
        List<String> words = new ArrayList<String>(Arrays.asList(arrWords));
        sc.close();

        if (!words.isEmpty() && words.get(0).isEmpty()){
            words.remove(0);
        }
        System.out.println(words.size()); 

    }
}
