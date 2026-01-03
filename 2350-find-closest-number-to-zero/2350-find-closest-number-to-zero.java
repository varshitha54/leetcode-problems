class Solution {
    public int findClosestNumber(int[] nums) {
        int x=nums.length;
        int minDis=Integer.MAX_VALUE;
        int p1=0;
        for(int i=0;i<x;i++)
        {
            int dis=Math.abs(nums[i]);
            if(dis<minDis || (dis==minDis && nums[i]>p1)){
                minDis=dis;
                p1=nums[i];

            }
    
        }
        return p1;
    }
}