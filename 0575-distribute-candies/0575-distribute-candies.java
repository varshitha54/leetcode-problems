class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int unique=1;
        for(int i=1;i<candyType.length;i++){
            if(candyType[i]!=candyType[i-1]){
              unique++;
            }

        }
        return Math.min(unique,candyType.length/2);
    }
}