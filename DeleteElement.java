public class DeleteElement {
    public static void main(String[] args) {

        int[] arr = {5,10,15,20,25,30,35};
        int n = arr.length;
        int pos = 2; // 1-based position to delete

        // shift elements to left
        for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // print updated array
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}