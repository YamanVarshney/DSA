public class Sum {
    public static void main(String args[]){
        int arr[] ={ 1,10,25,11,44,55,6};
        int sum = 0;
        for(int i= 0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Sum of elements: "+sum);
    }
}
