// class Solution {
//     public int mySqrt(int x) {
//          long low=0, high = x;
        
//         while(low<=high){
//             long mid = (low+high) /2;
//             if(mid*mid==x) return (int)mid;
//             else if (mid*mid > x) high=mid-1;
//             else low=mid+1;
//         }
//         return (int)high;
//     }
// }


class Solution {
    public int mySqrt(int x) {
        int low=1, high = x;
        if(x==0)  return 0;
        while(low<=high){
            int mid = low+(high-low) /2;
            if(mid==x/mid) return mid;
            else if (mid> x/mid) high=mid-1;
            else low=mid+1;
        }
        return high;
    }
}