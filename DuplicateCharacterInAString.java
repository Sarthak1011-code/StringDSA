import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharacterInAString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // store frequency

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        // print duplicate characters

        for (char ch : map.keySet()) {

            if (map.get(ch) > 1) {

                System.out.println(ch);

            }

        }

    }
}
