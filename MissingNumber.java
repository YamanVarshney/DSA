class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        int n = nums.length;
        int sum = n * (n + 1) / 2;

        int arrSum = 0;
        for (int num : nums)
            arrSum += num;

        System.out.println("Missing: " + (sum - arrSum));
    }
}