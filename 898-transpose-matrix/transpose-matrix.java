class Solution {
    public int[][] transpose(int[][] matrix) {
        //  for Square matrices only
        // for(int i=0; i<matrix.length; i++){
        //     for (int j=0; j<i ;j++){
        //         int temp= matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
        // }

        // for (int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}