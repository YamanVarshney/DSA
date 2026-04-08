import java.util.Scanner;

public class ReverseString {

    public String reverseString(String st) {
        String ans = "";
        for(int i = 0; i < st.length(); i++){
            ans = st.charAt(i) + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String input = sc.nextLine();

        ReverseString obj = new ReverseString();
        System.out.println("Reversed: " + obj.reverseString(input));

        sc.close();
    }
}