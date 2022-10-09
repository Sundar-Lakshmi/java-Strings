import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        count(str);
    }

    public static int count(String str) {
        int num = 0;
        while (num<str.length()) {
            char ch = str.charAt(num);
            System.out.println(ch);
            num = num+2;
        }
        return num;
    }
}
