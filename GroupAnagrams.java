import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GroupAnagrams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextLine();

        }

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : arr) {

            char ch[] = str.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(str);

        }

        for (ArrayList<String> group : map.values()) {

            System.out.println(group);

        }

    }
}
