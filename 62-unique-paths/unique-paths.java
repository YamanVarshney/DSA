// class Solution {
//     public int uniquePaths(int m, int n) {
//         if(m==1 || n==1) return 1;
//         return uniquePaths(m-1, n) + uniquePaths(m,n-1);
//     }
// }


// class Solution{
//     public int paths(int cr, int cc, int lr, int lc){
//         if(cr==lr && cc ==lc) return 1;
//         if(cr>lr || cc>lc) return 0;

//         int right = paths(cr, cc+1, lr,lc);
//         int down = paths(cr+1, cc, lr, lc);
//         return right + down;
//     }

//     public int uniquePaths(int m, int n){
//         return paths(0,0,m-1,n-1);
//     }
// }



class Solution {
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        // First row
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // First column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // Fill the remaining cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}