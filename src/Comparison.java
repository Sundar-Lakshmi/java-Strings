import java.util.ArrayList;
import java.util.Arrays;

public class Comparison {
    public static void main(String[] args){
        String a = "Sundar";
        String b = "Sundar";
        Integer num = new Integer("56");
        System.out.println(num.toString());

        System.out.println(a==b);

         a = "Premi";
//         System.out.println(b + a);

         System.out.println( Arrays.toString(new int[] {2,3,4,5,6}));
         System.out.println("Sundar" +Arrays.toString(new int[4]));
         System.out.println("Sundar" + new ArrayList<>());
    }
}
