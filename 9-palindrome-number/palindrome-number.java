class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        int a = x;  //original
        int b = 0;  //reverse

        while(x!=0){
            int digit = x%10;
            b = b*10 +digit;
            x=x/10;
        }
        return a == b;
    }
}