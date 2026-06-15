class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
         double prevTime=0;
         int fleets=0;
         int[][] pair=new int[speed.length][2];
         for(int i=0;i<position.length;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
         }
         Arrays.sort(pair,(a,b)->b[0]-a[0]);

         for(int i=0;i<pair.length;i++){
            double time= (double) (target-pair[i][0])/pair[i][1];
            if(time > prevTime){
                fleets++;
                prevTime=time;
            }

         }
         return fleets;
        
    }
}
