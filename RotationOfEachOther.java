import java.util.Scanner;

public class RotationOfEachOther {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();

        String s2 = sc.nextLine();

        // lengths must be same

        if (s1.length() != s2.length()) {

            System.out.println(false);

            return;

        }

        // concatenate s1 with itself

        String temp = s1 + s1;

        // check if s2 exists inside temp

        if (temp.contains(s2)) {

            System.out.println(true);

        } else {

            System.out.println(false);

        }

    }
}
