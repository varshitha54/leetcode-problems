class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[2];
        int miss=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                arr[0]=nums[i];
            }
                else if(nums[i]>nums[i-1]+1){
                miss=nums[i-1]+1;
            }
        }
         if(nums[0]!=1){
          miss=1;
        }
           else if(nums[nums.length-1]!=nums.length){
              miss=nums.length;
            }

        
        arr[1]=miss;
        return arr;
    }
}