import java.util.Scanner;

public class InsertElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for (int i =0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int position = sc.nextInt();
        int x = sc.nextInt();

        for(int i=n; i>=position; i--){
            arr[i] = arr[i-1];
        }

        arr[position-1] = x;

        for(int i=0; i<=n; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}