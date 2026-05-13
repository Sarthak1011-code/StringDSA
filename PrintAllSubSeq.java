import java.util.Scanner;

public class PrintAllSubSeq {
    public static void subsequence(String str,

            int index,

            String ans) {

        if (index == str.length()) {

            System.out.println(ans);

            return;

        }

        subsequence(str, index + 1,

                ans + str.charAt(index));

        subsequence(str, index + 1,

                ans);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        subsequence(str, 0, "");

    }
}
