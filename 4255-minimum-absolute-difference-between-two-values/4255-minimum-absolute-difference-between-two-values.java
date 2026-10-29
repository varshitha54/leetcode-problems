class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==1 && nums[j]==2){
                    int dif=Math.abs(i-j);
                    if(min>dif)
                    min=dif;
                }

            }
        }
        return min==Integer.MAX_VALUE?-1 : min;
    }
}