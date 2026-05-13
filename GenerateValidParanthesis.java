import java.util.Scanner;

public class GenerateValidParanthesis {
    public static void generate(int open,

            int close,

            int n,

            String ans) {

        if (ans.length() == 2 * n) {

            System.out.println(ans);

            return;

        }

        if (open < n) {

            generate(open + 1,

                    close,

                    n,

                    ans + "(");

        }

        if (close < open) {

            generate(open,

                    close + 1,

                    n,

                    ans + ")");

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        generate(0, 0, n, "");

    }
}
