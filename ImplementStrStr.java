import java.util.Scanner;

public class ImplementStrStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String haystack = sc.nextLine();

        String needle = sc.nextLine();

        int index = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j;

            for (j = 0; j < needle.length(); j++) {

                if (haystack.charAt(i + j) != needle.charAt(j)) {

                    break;

                }

            }

            if (j == needle.length()) {

                index = i;

                break;

            }

        }

        System.out.println(index);

    }
}
