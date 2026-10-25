class Solution {
    public int calculateScore(int a, int b) {
        String binary = Integer.toBinaryString(a);
        String binary1 = Integer.toBinaryString(b);
        int s1=0,s2=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1')
            s1++;
 
        }
        for(int i=0;i<binary1.length();i++){
            if(binary1.charAt(i)=='1')
            s2++;
        }
        if(s1>=s2)
        return s1*s2;

        return s2/s1;
    }
}