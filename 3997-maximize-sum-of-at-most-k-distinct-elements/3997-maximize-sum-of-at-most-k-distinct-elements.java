class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int[] arr=new int[k];
        int j=0;
        for(int i=nums.length-1;i>=0 && j<k ;i--){
            if (j == 0 || arr[j - 1] != nums[i]) {
           arr[j]=nums[i];
           j++;
        }
        }
        return Arrays.copyOf(arr, j);
    }
}