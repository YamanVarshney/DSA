public class MajorityElement {
    public static void FindMajorityElement(int arr[]){
        int ele = 0;
        int count =0;

        for(int i= 0; i<arr.length; i++){
            if(count == 0){
                ele = arr[i];
            }

            if(arr[i] == ele){
                count++;
            } else{
                count--;
            }
        }

        count = 0;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] == ele){
                count++;
            }
        }

        if(count> arr.length/2){
            System.out.println("Majority element: "+ ele);
            System.out.println("Number of times it occur: "+ count);
        } else{
            System.out.println("No majority number");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,5,3,5,4,4,5,5,5};
        FindMajorityElement(arr);
    }
}
