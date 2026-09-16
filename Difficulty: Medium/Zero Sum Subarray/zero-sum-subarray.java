class Solution {
    public boolean subArrayExists(int arr[]) {
        
        
        HashSet<Integer> set = new HashSet<>();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == 0 || set.contains(sum)) {
                return true;
            }

            set.add(sum);
        }

        return false;
    }
}