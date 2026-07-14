public class Palindrome {

    boolean isPalindrome(int num) {

        int temp = num;
        int rev = 0;

        while (num > 0) {

            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        return temp == rev;
    }
}
