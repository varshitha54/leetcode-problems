class Solution {
    public int minimumChairs(String s) {
        int c=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch == 'E'){
                c++;
                count=Math.max(c,count);
            }
            else{
                c--;
            }
        }
        return count;
    }
}