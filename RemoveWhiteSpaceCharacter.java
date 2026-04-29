import java.util.*;

public class RemoveWhiteSpaceCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] words = str.split("\\s+");

        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += words[i];
        }

        System.out.println(result);

        sc.close();
    }
}
