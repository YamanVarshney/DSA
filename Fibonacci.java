import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int x=0 , y=1;
        for(int i=0 ; i<=n ; i++){
            System.out.print(x+" ");
            int z = x+y;
            x = y;
            y = z;
            sc.close();
        }
    }
}
