public class DuplicateCharacters {
    public static void main(String[] args) {
        String string1 = "Gaaabbb";
        int count;

        //Converts given string into character array
        char string[] = string1.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
