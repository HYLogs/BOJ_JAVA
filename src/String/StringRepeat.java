package String;
import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int totalCount = Integer.parseInt(sc.nextLine());
        String result = "";

        for (int i = 0; i < totalCount; i++){
            String[] CountValue = sc.nextLine().split(" ");
            for (int j = 0; j < CountValue[1].length(); j++){
                for (int k = 0; k < Integer.parseInt(CountValue[0]); k++){
                    result += CountValue[1].charAt(j);
                }
            }
            result += "\n";
        }
        System.out.print(result);
        sc.close();
    }
}
