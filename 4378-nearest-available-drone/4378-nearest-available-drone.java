class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int index=-1,max=Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++){
            int dis=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(dis<=drones[i][2] && dis<max){
            max=dis;
            index=i;

        }
        }
        return index;
    }
}