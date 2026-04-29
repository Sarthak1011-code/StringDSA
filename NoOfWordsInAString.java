import java.util.*;

public class NoOfWordsInAString {
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);

    // String str = sc.nextLine();

    // int count = 0;

    // for (int i = 0; i < str.length(); i++) {
    // count++;
    // }

    // System.out.print(count);

    // sc.close();
    // }

    // Another approach

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);

    // String str = sc.nextLine();

    // HashMap<Character, Integer> map = new HashMap<>();

    // for(int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);

    // if(map.containsKey(ch)) {
    // map.put(ch, map.get(ch) + 1);
    // }else {
    // map.put(ch, 1);
    // }
    // }

    // System.out.println(map);

    // sc.close();
    // }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        System.out.println(words.length);

        sc.close();
    }
}
