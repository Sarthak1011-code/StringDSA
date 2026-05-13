import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // length check
        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // frequency count for first string
        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        boolean isAnagram = true;

        // reduce frequency using second string
        for (int i = 0; i < s2.length(); i++) {

            char ch = s2.charAt(i);

            if (!map.containsKey(ch)) {
                isAnagram = false;
                break;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        if (!map.isEmpty()) {
            isAnagram = false;
        }

        System.out.println(isAnagram);
    }
}