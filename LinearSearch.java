public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int k = 30;

        int comparisons = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            comparisons++;

            if (arr[i] == k) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not Found");
        }

        System.out.println("Comparisons = " + comparisons);
    }
}