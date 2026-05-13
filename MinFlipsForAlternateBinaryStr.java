import java.util.Scanner;

public class MinFlipsForAlternateBinaryStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int flip1 = 0;

        int flip2 = 0;

        for (int i = 0; i < s.length(); i++) {

            char expected1 = (i % 2 == 0) ? '0' : '1';

            char expected2 = (i % 2 == 0) ? '1' : '0';

            if (s.charAt(i) != expected1) {

                flip1++;

            }

            if (s.charAt(i) != expected2) {

                flip2++;

            }

        }

        System.out.println(Math.min(flip1, flip2));

    }
}
