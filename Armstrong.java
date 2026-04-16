import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int n2 = n;
        int count =0;
        
        while(n2>0){
            count++;
            n2 = n2/10;
        }

        n2 = n;
        int sum = 0;

        while(n2>0){
            int m = n2%10;
            sum += (int) Math.pow(m, count);
            n2 = n2/10;
        }

        if(sum==n){
            System.out.println(n+ " is armstrong number");
        }  else{
            System.out.println(n+" is not armstrong number");
        }

        sc.close();
    }
}
