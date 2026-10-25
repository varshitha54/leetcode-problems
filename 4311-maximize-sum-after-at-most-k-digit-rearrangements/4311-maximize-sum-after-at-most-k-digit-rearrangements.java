class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum = 0;
        long[] gains = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            char[] digits = String.valueOf(nums[i]).toCharArray();
            Arrays.sort(digits);

            long maxNum = 0;
            for (int j = digits.length - 1; j >= 0; j--) {
                maxNum = maxNum * 10 + (digits[j] - '0');
            }

            gains[i] = maxNum - nums[i];
        }

        Arrays.sort(gains);

        for (int i = 0; i < k; i++) {
            sum += gains[gains.length - 1 - i];
        }

        return sum;
    }
}
