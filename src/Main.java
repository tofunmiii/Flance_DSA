import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(int b) {
        if (b < 0 || (b % 10 == 0 && b != 0)) {
            return false;
        }
        int org = b;
        int rev = 0;
        while (b > 0) {
            int digit = b % 10;
            rev = rev * 10 + digit;
            b /= 10;
        }
        return org == rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: x = ");
        int x = scanner.nextInt();
        boolean res = isPalindrome(x);

        System.out.println("Output: " + res);

        if (res) {
            System.out.println("Explanation: " + x + " reads as " + x + " from left to right and from right to left.");
        } else {
            if (x < 0) {
                System.out.println("Explanation: From left to right, it reads " + x + ". From right to left, it becomes " + new StringBuilder(Integer.toString(x)).reverse().toString() + ". Therefore it is not a palindrome.");
            } else if (x % 10 == 0 && x != 0) {
                System.out.println("Explanation: Reads 0 from right to left which makes it not a palindrome.");
            } else {
                System.out.println("Explanation: Reads " + new StringBuilder(Integer.toString(x)).reverse().toString() + " from right to left. Therefore it is not a palindrome.");
            }
        }
    }
}
