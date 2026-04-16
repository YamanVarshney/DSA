public class MaxElement{
    public static void main(String args[]){
        int arr[] ={0,10,5,123,122,11};
        int max = 0;
        for(int i = 0; i<arr.length ;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.err.println("Max element is: "+ max);
    }
}