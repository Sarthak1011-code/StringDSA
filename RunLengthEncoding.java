import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String encoded = "";

        int count;

        for (int i = 0; i < str.length(); i++) {

            count = 1;

            while (i < str.length() - 1 &&

                    str.charAt(i) == str.charAt(i + 1)) {

                count++;

                i++;

            }

            encoded += str.charAt(i);

            encoded += count;

        }

        System.out.println(encoded);

    }
}
