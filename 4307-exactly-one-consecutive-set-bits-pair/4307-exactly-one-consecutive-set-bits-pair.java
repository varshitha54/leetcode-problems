class Solution {
    public boolean consecutiveSetBits(int n) {
        int count=0;
        String binary=Integer.toBinaryString(n);
        for(int i=0;i<binary.length()-1;i++){
            if(binary.charAt(i)=='1' && binary.charAt(i+1)=='1')
            count++;
        }
        return count==1;
    }
}