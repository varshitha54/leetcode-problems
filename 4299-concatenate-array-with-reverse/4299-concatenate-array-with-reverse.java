class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] newarr=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            newarr[i]=nums[i];
        }
        int j=nums.length;
        for(int i=nums.length-1;i>=0;i--){
            newarr[j]=nums[i];
            j++;
        }
        return newarr;
    }
}