import java.util.Scanner;

public class LexicographicallySmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int k = sc.nextInt();

        String smallest = s.substring(0, k);

        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {

            String sub = s.substring(i, i + k);

            if (sub.compareTo(smallest) < 0) {

                smallest = sub;

            }

            if (sub.compareTo(largest) > 0) {

                largest = sub;

            }

        }

        System.out.println("Smallest: " + smallest);

        System.out.println("Largest: " + largest);

    }
}
