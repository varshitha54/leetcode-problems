class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
         List<Integer> ans=new ArrayList<>();
        int start=nums[0];
        int end=nums[nums.length-1];
        for(int j=start+1;j<=end;j++){
            boolean found=false;
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]==j){
                found=true;
            break;
        }
    }
    if(!found)
        ans.add(j);
    
    }
    return ans;
}
}