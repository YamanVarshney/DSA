import java.util.Scanner;

public class getMaxWordLength {

    public static int getMaxWordLength(String s) {
        int max = 0, count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                if (count > max) 
                    max = count;
                count = 0;
            }
        }

        // Check last word
        if (count > max) 
            max = count;

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        int result = getMaxWordLength(input);
        System.out.println("Length of longest word: " + result);

        sc.close();
    }
}