class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int dis=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(dis!=-1 && i-dis-1<k){
                    return false;
                }
                dis=i;
            }
        }
            
        return true;

}
}