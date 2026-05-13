import java.util.*;

public class FirstRepeatingCharacter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first repeating character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) > 1) {
                System.out.println("First repeating character: " + ch);
                return;
            }
        }

        System.out.println("No repeating character found");
    }
}