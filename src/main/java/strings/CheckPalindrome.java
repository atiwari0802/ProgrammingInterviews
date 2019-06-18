package strings;

public class CheckPalindrome {

    public boolean isPalindrome(String input) {

        int i = 0, j = input.length() - 1;
        input = input.toLowerCase();

        while (i < j) {
            while (!Character.isLetterOrDigit(input.charAt(i)) && i < j) {
                i++;
            }
            while (!Character.isLetterOrDigit(input.charAt(j)) && i < j) {
                j--;
            }
            if (input.charAt(i++) != input.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
