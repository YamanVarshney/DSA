class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max = arr[0], min = arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
            else if(min> arr[i]){
                min =arr[i];
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);

        return ans;
    }
}
