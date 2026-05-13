import java.util.*;
// 
// Two strings are anagrams if:

// * They have the same length
// * They contain the same characters with the same frequency
public class CheckIfTwoStrAreAnagrams {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // check the size first.
        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }

        sc.close();
    }
}
