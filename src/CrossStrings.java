import java.util.Scanner;

public class CrossStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i <= str.length()-1; i++) {
            for (int j = 0; j <= str.length() - 1; j++) {
                if (i == j || i + j == str.length()-1) {
                    System.out.print(str.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
