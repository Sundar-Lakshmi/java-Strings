import java.util.Scanner;
public class CrossString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i<str.length(); i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println(str.charAt(i));
        }
        for(int i = str.length()-1; i>=0; i--){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println(str.charAt(i));
        }
        }
    }
