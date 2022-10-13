import java.util.Scanner;

public class CountAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        count(s);
    }

    public static int count(String s) {
        int count = 1;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            for (j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    System.out.print(s.charAt(i) + "" + count);
                    count = 0;
                    i=j;
                    break;
                }

            }
        }
        return count;
    }
}
