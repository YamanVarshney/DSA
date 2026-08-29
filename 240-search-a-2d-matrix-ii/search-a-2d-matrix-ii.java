// class Solution {
//     public boolean searchMatrix(int[][] arr, int target) {
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[0].length; j++){
//                 if(arr[i][j] == target) 
//                 return true;
//             }
//         }
//         return false;
//     }
// }



class Solution{
    public boolean searchMatrix(int[][]arr, int target){
        int n= arr.length;
        int row=0;
        int col = arr[0].length-1;

        while(row<n && col>=0){

            if(arr[row][col] == target){
                return true;
            }

            if(arr[row][col]> target) {
                col--;
            } else{
                row++;
            }
        }
        return false;
    }
}