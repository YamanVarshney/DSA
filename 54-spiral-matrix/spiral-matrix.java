class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = arr.length-1;
        int left = 0;
        int right = arr[0].length-1;

        while(top<= bottom && left<=right){

            //left to right
            for (int i= left; i<=right; i++){
                result.add(arr[top][i]);
            }
            top++;

            //top to bottom
            for (int j=top;j<=bottom; j++){
                result.add(arr[j][right]);
            }
            right--;

            //right to left 
            if(top<= bottom){
            for (int i= right; i>=left; i--){
                result.add(arr[bottom][i]);
            }
            bottom--;
            }

            //bottom to top
            if(left<=right){
            for (int j=bottom; j>=top; j--){
                result.add(arr[j][left]);
            }
            left++;
        }
    }
    return result;
}
}