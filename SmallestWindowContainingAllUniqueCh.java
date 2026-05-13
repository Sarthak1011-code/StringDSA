import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SmallestWindowContainingAllUniqueCh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        HashSet<Character> unique = new HashSet<>();

        for (char ch : s.toCharArray()) {

            unique.add(ch);

        }

        int required = unique.size();

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;

        int formed = 0;

        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.get(ch) == 1) {

                formed++;

            }

            while (formed == required) {

                minLen = Math.min(minLen,

                        right - left + 1);

                char leftChar = s.charAt(left);

                map.put(leftChar,

                        map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {

                    formed--;

                }

                left++;

            }

        }

        System.out.println(minLen);

    }
}
