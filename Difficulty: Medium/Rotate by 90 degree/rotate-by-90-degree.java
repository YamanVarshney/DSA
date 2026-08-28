class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n= mat.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j] =mat[j][i];
                mat[j][i] =temp;
            }
        }

        for(int i=0; i<n; i++){
            int top=0;
            int bottom =n-1; 

            while(top<bottom){
                int temp= mat[top][i];
                mat[top][i] = mat[bottom][i];
                mat[bottom][i] = temp;

                top++;
                bottom--; 
            }
        }
    }
}