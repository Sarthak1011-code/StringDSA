import java.util.Scanner;

public class AllSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // starting index

        for (int i = 0; i < str.length(); i++) {

            // ending index

            for (int j = i + 1; j <= str.length(); j++) {

                System.out.println(str.substring(i, j));

            }

        }

    }
}
