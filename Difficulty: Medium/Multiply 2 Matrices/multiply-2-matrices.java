class Solution {
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // code here
        int n = mat1.length;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // Create result matrix
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(0);
            }

            result.add(row);
        }

        // Matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    result.get(i).set(j,
                        result.get(i).get(j)
                        + mat1[i][k] * mat2[k][j]
                    );
                }
            }
        }

        return result;
    }
}