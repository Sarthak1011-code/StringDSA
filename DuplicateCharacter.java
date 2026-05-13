import java.util.HashSet;
import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        String result = "";

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // add only first occurrence

            if(!set.contains(ch)) {

                set.add(ch);

                result += ch;

            }

        }

        System.out.println(result);

    }
}
