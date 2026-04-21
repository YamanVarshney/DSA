public class MergeArrays {
    public static void main(String[] args) {
        int[] a = {1,4,7};
        int[] b = {2,3,6};

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                System.out.print(a[i++] + " ");
            else
                System.out.print(b[j++] + " ");
        }

        while (i < a.length)
            System.out.print(a[i++] + " ");

        while (j < b.length)
            System.out.print(b[j++] + " ");
    }
}