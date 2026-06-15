class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int product=1;
        int product1=1;
        for(int i=n;i>=n-2;i--){
            product*=nums[i];
        }
        product1=nums[0]*nums[1]*nums[n];

        return Math.max(product,product1);

    }
}