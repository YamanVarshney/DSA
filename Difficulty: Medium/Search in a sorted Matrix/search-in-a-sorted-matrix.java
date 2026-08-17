class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int rows = mat.length;
        int cols = mat[0].length;
        int low =0;
        int high = rows*cols - 1;
        
        while(low<=high){
            int mid  = low+(high-low)/2;
            
            int midRow = mid / cols;
            int midCol = mid % cols;
            
            if(mat[midRow][midCol] == x)
                return true;
            
            else if(mat[midRow][midCol] > x)
                high = mid-1;
            
            else
                low= mid+1;
        }
        return false;
    }
}
