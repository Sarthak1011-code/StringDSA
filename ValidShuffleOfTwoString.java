import java.util.Scanner;

public class ValidShuffleOfTwoString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();

        String s2 = sc.nextLine();

        String shuffle = sc.nextLine();

        if (s1.length() + s2.length() != shuffle.length()) {

            System.out.println(false);

            return;

        }

        int i = 0, j = 0, k = 0;

        while (k < shuffle.length()) {

            if (i < s1.length() &&

                    s1.charAt(i) == shuffle.charAt(k)) {

                i++;

            } else if (j < s2.length() &&

                    s2.charAt(j) == shuffle.charAt(k)) {

                j++;

            } else {

                System.out.println(false);

                return;

            }

            k++;

        }

        System.out.println(true);

    }
}
