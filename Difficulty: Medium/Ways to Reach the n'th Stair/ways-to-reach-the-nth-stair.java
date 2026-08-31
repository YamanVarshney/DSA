class Solution {
    public int countWays(int n) {
        // code here
        if(n<=2)  return n;
        
        int first =1;
        int second  =2;
        
        for (int i =3; i<=n; i++){
            int third = first+second;
            first = second;
            second = third;
        }
        return second;
    }
}