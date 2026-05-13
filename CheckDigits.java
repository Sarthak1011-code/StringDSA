import java.util.*;

public class CheckDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean onlyDigits = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // check if character is not digit
            if (ch < '0' || ch > '9') {
                onlyDigits = false;
                break;
            }
        }

        System.out.println(onlyDigits);
    }
}