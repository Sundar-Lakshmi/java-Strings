import java.util.Scanner;

public class RedendantCharacters {
    public static void main(String[] args){
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        letterCount(name);
    }

    public static void letterCount(String name) {

        String toCheck = "";
        int count = 0;

        for (int i = 0; i<name.length(); i++) {

            char ch = name.charAt(i);

            if(toCheck.indexOf(ch) == -1) {

                if(i!=0) {

                    System.out.print(name.charAt(i-1) + "" + count);
                }

                toCheck = toCheck + ch;
                count = 1;
            }
            else {
                count++;
            }
        }

        System.out.print(name.charAt(name.length() - 1) + "" + count);
    }
}
