import java.util.*;

public class FirstRepeatingCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) == 2) {
                System.out.println(ch);
                break;
            }
        }

        sc.close();
    }
}
