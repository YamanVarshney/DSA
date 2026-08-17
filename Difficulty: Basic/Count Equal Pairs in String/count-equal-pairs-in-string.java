// class Solution {
//     public long equalPairs(String s) {
//         long count = 0;
        
//         for(int i=0; i< s.length(); i++){
//             for(int j = 0; j<s.length(); j++){
//                 if(s.charAt(i) == s.charAt(j)){
//                     count ++;
//                 }
//             }
//         }
//         return count;
//     }
// }


class Solution{
    public int equalPairs(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        int count = 0;
        
        for(int freq: map.values()){
            count += freq*freq; 
        }
        
        return count;
    }
}