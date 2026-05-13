import java.util.HashMap;
import java.util.Scanner;

public class MinWindowSubStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String t = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        int left = 0;

        int count = t.length();

        int minLen = Integer.MAX_VALUE;

        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch)) {

                if (map.get(ch) > 0) {

                    count--;

                }

                map.put(ch, map.get(ch) - 1);

            }

            while (count == 0) {

                if (right - left + 1 < minLen) {

                    minLen = right - left + 1;

                    start = left;

                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {

                    map.put(leftChar,

                            map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {

                        count++;

                    }

                }

                left++;

            }

        }

        if (minLen == Integer.MAX_VALUE) {

            System.out.println("");

        } else {

            System.out.println(

                    s.substring(start, start + minLen)

            );

        }

    }
}
