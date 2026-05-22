class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int s=1;
        int e=Arrays.stream(piles).max().getAsInt();

        int res=e;

        while(s<=e){
            int k=s+(e-s)/2;
            long totalTime=0;
            for(int pile:piles){
                totalTime+=(Math.ceil((double)pile/k));
            }

            if(totalTime<=h){
                res=k;
                e=k-1;
            }
            else{
                s=k+1;
            }
        }
        return res;
        
    }
}
