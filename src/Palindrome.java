public class Palindrome {
    public static void main(String[] args) {
        String a = "aaadcba";
        System.out.println(palindrome(a));
    }

    public static boolean palindrome(String a) {
        for (int i = 0; i < a.length(); i++) {
            char start = a.charAt(i);
            char end = a.charAt((a.length() - 1) - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
